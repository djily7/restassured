package com.Day5SeleniumTestNG;

import org.testng.annotations.Test;


public class FirstTC {
	@Test (priority=1) // if we mention the priority  will do / priority
	void openApp() {
		System.out.println("I am opening the app here");
	}
	@Test (priority=3)
	void logot() {
		System.out.println("I am logging out the app here");
	}
	@Test (priority=2)
	void login() {
		System.out.println("I am logging into the app here");
}
}
