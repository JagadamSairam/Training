package cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cts.training.model.Company;

public class CompanyCotroller {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Company company1 = new Company(101, "CTS", "JavaFullStack", "Brian", 234456776.005);
		session.save(company1);
		transaction.commit();
		session.close();

	}
}
