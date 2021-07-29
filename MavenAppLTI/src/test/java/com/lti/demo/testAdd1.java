package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAdd1 {

	@Test
	public void test1() {
		
		Calculator cal = new Calculator();
		
		int res= cal.add(10, 20);
		
		assertEquals(30, res);
		
		
	}
	
	@Test
	public void test2() {
		
		Calculator cal = new Calculator();
		
		int res= cal.add(40, 20);
		
		assertEquals(60, res);
		
		
	}
	@Test
	public void test3() {
		
		Calculator cal = new Calculator();
		
		int res= cal.prod(3, 2);
		
		assertEquals(6, res);
		
		
	}
	@Test
	public void test4() {
		
		Calculator cal = new Calculator();
		
		int res= cal.prod(5,4);
		
		assertEquals(20, res);
		
		
	}

}
