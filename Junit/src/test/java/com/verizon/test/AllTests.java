package com.verizon.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestEligibilityService.class, TestGradingService.class, TestGreetingService.class,
		TestScoringService.class, TestScoringService2.class })
public class AllTests {

}
