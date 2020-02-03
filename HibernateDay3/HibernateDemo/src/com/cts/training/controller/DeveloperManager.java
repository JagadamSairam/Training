package com.cts.training.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.training.model.Developer;
import com.cts.training.model.Technology;

public class DeveloperManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Developer dev1= new Developer();
		Developer dev2= new Developer();
		Developer dev3= new Developer();
		Developer dev4= new Developer();
		dev1.setName("Nav");
		dev2.setName("Dev");
		dev3.setName("Jagadam");
		dev4.setName("mohan");
		
		Technology tech1= new Technology();
		Technology tech2= new Technology();
		Technology tech3= new Technology();
		Technology tech4= new Technology();
		tech1.setLanguage("CoreJava");
		tech1.setExpertise("Expert");
		tech2.setLanguage("Angular");
		tech2.setLanguage("Intermediate");
		tech3.setLanguage("Hibernate");
		tech3.setExpertise("Medium");
		tech4.setLanguage("Springs");
		tech4.setExpertise("Master");
		
		
		Set<Technology> technologies= new HashSet<Technology>();
		technologies.add(tech1);
		technologies.add(tech2);
		technologies.add(tech3);
		technologies.add(tech4);

		dev1.setTechnology(technologies);
		dev2.setTechnology(technologies);
		dev3.setTechnology(technologies);
		dev4.setTechnology(technologies);

		
//		Criteria criteria= session.createCriteria(Developer.class);
//		criteria.add(Restrictions.eq("id",32));
//		Developer dev= (Developer)criteria.uniqueResult();
//		System.out.println(".."+ dev.getName());
//		
//		Set<Technology> tech= dev.getTechnology();
//		for(Technology technologies : tech) {
//			System.out.println(technologies.getLanguage());
//		}
		
		
		
		
		session.save(dev1);
		session.save(dev2);
		session.save(dev3);
		session.save(dev4);
		
		transaction.commit();
		session.close();
	}

}
