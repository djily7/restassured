package com.DAy7SeleniumTestNGGrouping;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test(priority=1, groups = {"sanity","regression"})
	public void paymentByDollar() {
		System.out.println("Paying in SSSSSSSSSS");
	}
	@Test(priority=2, groups = {"sanity","regression"})
	public void paymentByPnd() {
		System.out.println("Paying in Pnd");
	}
	@Test(priority=3, groups = {"sanity","regression"})
	public void paymentByRs() {
		System.out.println("Paying in Rs");
	}

}
