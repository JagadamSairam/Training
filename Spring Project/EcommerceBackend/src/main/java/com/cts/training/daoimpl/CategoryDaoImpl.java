package com.cts.training.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.CategoryDao;
import com.cts.training.model.Category;
import com.cts.training.model.Product;

@Transactional
@Repository(value="categoryDao")
@Component
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean saveOrUpdateCategory(Category cat) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(cat);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}	}

	@Override
	public boolean deleteCategory(Category cat) {
		
		try {
			sessionFactory.getCurrentSession().delete(cat);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}	}

	@Override
	public Category getCategoryById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Category.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Category> getAllCategories() {
		try {
			return sessionFactory.getCurrentSession().createQuery("FROM Category").getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	

}
