package com.DAy7SeleniumTestNGGrouping;

import org.testng.annotations.Test;

public class SignupTest {
	
	@Test(priority=1, groups = {"regression"})
	public void SignupByEmail() {
		System.out.println("Signup by Email");
	}
	@Test(priority=2, groups = {"regression"})
	public void SignupByFB() {
		System.out.println("Signup by FaceBook");
	}
	@Test(priority=3, groups = {"regression"})
	public void SignupByTwiter() {
		System.out.println("Signup by Twiter");
	}

}


