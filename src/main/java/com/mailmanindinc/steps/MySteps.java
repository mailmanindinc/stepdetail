package com.mailmanindinc.steps;

import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.OutcomesTable;

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
	    // successful("Test Outcome");
	    
	}
    
}
