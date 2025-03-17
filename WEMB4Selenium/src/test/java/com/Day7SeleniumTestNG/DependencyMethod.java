package com.Day7SeleniumTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	@Test(priority=1)
	public void openApp() {
		Assert.assertTrue(false);
	}
	@Test(priority=2, dependsOnMethods = {"openApp"})
	public void login() {
		Assert.assertTrue(false);
	}
	@Test(priority=3,dependsOnMethods = {"openApp"})
	public void logout() {
		Assert.assertTrue(true);
	}

}
