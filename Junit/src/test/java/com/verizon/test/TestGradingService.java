package com.verizon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.verizon.exceptions.ScoreException;
import com.verizon.service.ScoringService;

public class TestGradingService {

	private ScoringService ss;

	@Before
	public void setUp() throws Exception {
		this.ss = new ScoringService();
	}

	@After
	public void tearDown() throws Exception {
		this.ss = null;
	}

	@Test
	public void testGetGradeiwhtValidData() {
		int[] marks = { 50, 60, 50 };
		int maxMark = 100;
		double expectedPercent = 53.33;
		try {
			double actual = ss.getPercentage(marks, maxMark);
			assertEquals(expectedPercent, actual, 0.05);
		} catch (ScoreException e) {
			fail("Exception not to be raised here");
		}
	}

	@Test(expected = ScoreException.class)
	public void testGetPercentagewithNullMarks() throws ScoreException {
		int[] marks = null;
		int maxMark = 100;
		ss.getPercentage(marks, maxMark);
		fail("Expecting and exception");

	}

	@Test(expected = ScoreException.class)
	public void testGetPercentageWithZeroInvalidMarks() throws ScoreException {
		int[] marks = { 23, -44, 55 };
		int maxMarks = 100;
		ss.getPercentage(marks, maxMarks);
		fail("Expecting an Negative Exception");
	}
}
