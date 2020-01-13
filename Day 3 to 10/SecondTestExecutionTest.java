package com.second.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.second.Second;

public class SecondTestExecutionTest {
	static Second s;
	@BeforeClass
	public static void init() {
	
		System.out.println("Object is created");
		s=new Second();
	}
	@AfterClass
	public static void destroy() {
		s = null;
		System.out.println("Object is destroyed");
	}
	@Test
	public void test() {
		assertEquals(5,s.add(2,3));
	}
	@Test
	public void tests() {
		assertEquals(5,s.sub(8,3));
	}


}
