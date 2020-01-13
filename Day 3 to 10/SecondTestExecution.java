package com.second.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
//import org.junit.jupiter.api.Test;

import com.second.Second;
	
class SecondTestExecution {
	Second s;
	@Before
	
public void create(){
	
	System.out.println("Object is created");
	s=new Second();
}
	public void destroy() {
		s = null;
		System.out.println("Object is destroyed");
	}
	
	@Test
	void test(){
		assertEquals(5, s.add(2, 3));
	}

	@Test
	void tests() {
		assertEquals(5,s.sub(8,3));
	}

}
