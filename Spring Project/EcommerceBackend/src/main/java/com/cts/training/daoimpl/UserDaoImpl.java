package com.cts.training.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.UserDao;
import com.cts.training.model.User;

@Transactional
@Repository(value = "userDao")
@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrUpdateUser(User user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<User> getAllUsers() {
		
		try {
			return sessionFactory.getCurrentSession().createQuery("FROM User").getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public User getUserById(int id) {

		try {
			return sessionFactory.getCurrentSession().get(User.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
