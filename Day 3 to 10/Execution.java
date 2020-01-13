package com.start;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.training.MyFirstProject;

public class Execution {

	MyFirstProject m;

	@Before
	public void create(){
		m = new MyFirstProject();
		System.out.println("Object Created");
	}

	@After
	public void destroy() {
		 m = null;
		System.out.println("Object Destroyed");
	}

	@Test
	void test() {
		assertEquals(5, m.add(2, 3));
	}

	@Test
	void tests() {
		assertEquals(0, m.sub(3, 3));
	}

}
