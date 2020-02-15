package com.cts.training.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.SupplierDao;
import com.cts.training.model.Supplier;

@Transactional
@Repository(value="supplierDao")
@Component
public class SupplierdaoImpl implements SupplierDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean saveOrUpdateSupplier(Supplier supplier) {
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteSupplier(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		try {
			return sessionFactory.getCurrentSession().createQuery("FROM Supplier").getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Supplier getSupplierById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Supplier.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	
	
}
