package com.cts.training.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.ProductDao;
import com.cts.training.dao.UserDao;
import com.cts.training.model.Product;
import com.cts.training.model.User;

@Transactional
@Repository(value = "productDao")
@Component
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean saveOrUpdateProduct(Product product) {
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Product> getAllProducts() {
		try {
			return sessionFactory.getCurrentSession().createQuery("FROM Product").getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Product getProductById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Product.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}


}
