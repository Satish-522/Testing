package com.verizon.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.verizon.model.Grade;
import com.verizon.service.ScoringService;

@RunWith(Parameterized.class)
public class TestScoringService2 {

	private double inputAvg;
	private Grade expectedGrade;
	private ScoringService ss;

	public TestScoringService2(double inputAvg, Grade expectedGrade) {
		super();
		this.inputAvg = inputAvg;
		this.expectedGrade = expectedGrade;

	}
	@Parameters
	public static Collection testData(){
		Object[][] data ={
				{95,Grade.A},{85,Grade.B},{73,Grade.C},{68,Grade.F}
		};
		return Arrays.asList(data);
	}

	@Before
	public void setUp() throws Exception {
		this.ss = new ScoringService();
	}

	@After
	public void tearDown() throws Exception {
		this.ss = null;
	}

	@Test
	public void testGetGrade() {
		assertEquals(expectedGrade, ss.getGrade(inputAvg));
	}

}
