package com.mailmanindinc.steps;

import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.model.OutcomesTable;
import org.jbehave.core.steps.AbstractStepResult.Failed;
import org.jbehave.core.steps.AbstractStepResult.Successful;

public class MySteps {
	
	@Given("Testcasewith outcome $testcasename")
	public void testCaseName(String testcasename) {
		OutcomesTable outcomes = new OutcomesTable();
	    outcomes.addOutcome("PositiveTest aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa: ", "Test", Matchers.equalTo("Test"));
	    outcomes.addOutcome("PositiveTest bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb1: ", "Test 1", Matchers.equalTo("Test 1")); 
	    outcomes.addOutcome("NegativeTest ccccccccccccccccccccccccccccccccccccccccc : ", "Test", Matchers.equalTo("TestV"));
	    outcomes.toString();
	 
	    outcomes.verify();
	    
	    // Outcomes does not work positive case.
	    // Write something here to write to report
	      // Get "reporter" for current thread using AOP
	     //Successful.successful("Test Outcome").describeTo(reporter);
	     // e is throwable
	     //Failed.failed("Test Failed Outcome", e).describeTo(reporter);
	    
	}
    
}
