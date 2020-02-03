package com.cts.training.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.ContractualExample;
import com.cts.training.model.Employee;
import com.cts.training.model.PerminentEmployee;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("Mallavika");
		PerminentEmployee pe=new PerminentEmployee();
		pe.setSalary(21312142);
		pe.setBonas(3243241f);
		
		ContractualExample ce= new ContractualExample();
		ce.setPayPerHour(2000);
		ce.setContractPeriod(12);
		
		
//		Employee emp=session.get(Employee.class, 20);
//		System.out.println(emp);
		
//		Map<String,String> emails= new LinkedHashMap<String,String>();
//		emails.put("PersonalEmail","Malavika@gmail.com");
//		emails.put("NormalEmail","Mallu@gmail.com");
//		emails.put("GeneralEmail","Unnni@gmail.com");
		
//		Set<String> emails=new LinkedHashSet<String>();
//		emails.add("Jagadamsairam@gmail.com");
//		emails.add("Sairam@gmail.com");
//		emails.add("Jagadam@gmail.com");
//		employee.setEmails(emails);
		session.save(employee);
		session.save(pe);
		session.save(ce);
		
		transaction.commit();
		session.close();
		
		

	}

}
