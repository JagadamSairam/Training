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
		

		
		StockExchange s = new StockExchange(2, "BSE", "Mumbai", "Mutual Funds");
		session.save(s);
		
		transaction.commit();
		session.close();
		
	}

}
