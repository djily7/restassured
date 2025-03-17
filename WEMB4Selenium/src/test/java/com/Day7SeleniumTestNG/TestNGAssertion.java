package com.Day7SeleniumTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertion {
	/*While automating our test cases, we need to validate if  the actual result matches with the expected result
	 * Assertion:  are used to perform various types of validation in the test cases, witch help us to decide the test cases pass or failed
	 * Assertion test cases considered successfully only if all the assertions have met and if it runs without any exeptions
	 * There are 2 types of assertions
	 * 1-- Hard Assertion
	 * 2--- Soft Assertions(Verify)
	 */
	// HARD Assertion
	@Test
	public void testHardAssert() {
		Assert.assertEquals("xyz", "xyz");// pass
		Assert.assertEquals(123, 124); // fail
		Assert.assertEquals("123", 123); // fail
		Assert.assertEquals("123", "123"); //pass
		/*
		 * Test execution is stopped if the test does not meet the assertion condition
		 * the test cases as failed when hard assertion condition fails
		 * Throws the assertExeption immediately when assertion condition fail
		 * we use hard assert to verify the mandatory or crucial information
		 */
	}
	@Test
	public void testHardAssert2 () {
		
		int expectedSum = 15;
		int ActualSum = 5+5;
		Assert.assertEquals(expectedSum, ActualSum,"The expected and actual are not matching");		
	}
	
	@Test
	public void testSoftAssert () {
		/*
		 * does not throw any exception when the assertion condition fails
		 * continues with test execution even if the assertion is not met
		 * we go for soft assert to verify non  mandatory   fields
		 * we have to make object of the soft assert then we can use methods from soft assert class
		 * assertAll() should be used at the end of test script, to collect all the logs and display on the console
		 */
		
		Object driver;
		SoftAssert sa = new SoftAssert();
	}

}
