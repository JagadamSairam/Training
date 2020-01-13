package com.emp.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.emp.Employee;

public class EmployeeTest {
	Employee e;

	@Before
	public void init() {
		e=new Employee();
		//System.out.println("Object is created");
	}

	@After
	public void destroy() {
		e=null;
		//System.out.println("Object is destroyed");
	}

	@Test
	public void test() {
		e.putData();
		e.getData();
	}

}
