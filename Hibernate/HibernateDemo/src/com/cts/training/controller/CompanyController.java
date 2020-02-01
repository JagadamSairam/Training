package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Company;
import com.cts.training.model.StockExchange;

public class CompanyController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Company company = new Company(101, "CTS", "Digital Transformation", "Brian Hamphrac", 567576576.676);
//		session.save(company);
		
		StockExchange se = new StockExchange(1, "BSE", "Mumbai", "Mutual Funds");
		session.save(se);
		
		transaction.commit();
		session.close();
		
	}

}
