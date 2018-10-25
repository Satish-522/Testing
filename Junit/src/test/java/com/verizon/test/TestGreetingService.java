package com.verizon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.verizon.service.GreetingService;

public class TestGreetingService {
	GreetingService gs;
	
	@Before
	public void setUp() throws Exception {
		this.gs= new GreetingService();
	}

	@After
	public void tearDown() throws Exception {
		this.gs=null;
	}

	@Test
	public void testGreetForValidUserName() {
		String input ="Srinivasan";
		String expected ="Hello Srinivasan";
		String actual = gs.greet(input);
		assertEquals(expected, actual);
	}
	 @Test
	 public void testGreetForNUllUserName(){
		 String actual = gs.greet(null);
		 assertNull(actual);
	 }

}
