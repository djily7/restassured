package com.Day5SeleniumTestNG;

import org.testng.annotations.*;


public class AnnotationTestNG {
	
	@BeforeMethod
	void login() {
		System.out.println("Log in method");
	}
	@Test (priority=1)
	void search() {
		System.out.println("This is the main test case for search");
	}
	@Test (priority=2)
	void Advsearch() {
		System.out.println("This is the main test case for Advance search");
	}
	@AfterMethod
	void logout() {
		System.out.println("Log out method");
	}	

}
