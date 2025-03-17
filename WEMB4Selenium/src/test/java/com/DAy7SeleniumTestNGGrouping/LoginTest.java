package com.DAy7SeleniumTestNGGrouping;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1, groups = {"sanity"})
	public void loginByEmail() {
		System.out.println("Log in by Email");
	}
	@Test(priority=2, groups = {"sanity"})
	public void loginByFB() {
		System.out.println("Log in by FaceBook");
	}
	@Test(priority=3, groups = {"sanity"})
	public void loginByTwiter() {
		System.out.println("Log in by Twiter");
	}

}
