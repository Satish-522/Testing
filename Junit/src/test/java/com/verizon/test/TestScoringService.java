package com.verizon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.verizon.model.Grade;
import com.verizon.service.GreetingService;
import com.verizon.service.ScoringService;

public class TestScoringService {
	ScoringService gs;

	@Before
	public void setUp() throws Exception {
		this.gs = new ScoringService();
	}

	@After
	public void tearDown() throws Exception {
		this.gs = null;
	}

	@Test
	public void testGetGradeForGradeA() {
		assertEquals(Grade.A, gs.getGrade(90));
	}

	@Test
	public void testGetGradeForGradeB() {
		assertEquals(Grade.B, gs.getGrade(85));
	}

	@Test
	public void testGetGradeForGradeC() {
		assertEquals(Grade.C, gs.getGrade(70));
	}

	@Test
	public void testGetGradeForGradeF() {
		assertEquals(Grade.F, gs.getGrade(69));
	}
}
