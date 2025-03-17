package com.Day7SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	// I want to test for multiple accounts
	@DataProvider(name = "dp")
	Object [][] loginData()
	{
	Object [][]data = {
			{"abc@gmail.com", "test123"},
			{"djilyaouad@gmail.com", "Qwerty"},
			{"xya@gmail.com", "test123"},
			{"rifat@gmail.com", "test123"},
			{"Paul@gmail.com", "test123"},
		};
		return data;
	}

	
	WebDriver driver;
	@BeforeMethod
	void setUp() throws InterruptedException
	{
	driver = new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	}
	
	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) throws InterruptedException
	{
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(3000);
	boolean status = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
	if(status ==true)
	{
	driver.findElement(By.xpath("(//a[@href='https://tutorialsninja.com/demo/index.php?route=account/logout' and text()='Logout'])[2]")).click();
	Assert.assertTrue(true);
	}
	else
	{
	}
	}
	
	//@Test
	void testLogin1(String email, String pwd) throws InterruptedException
	{
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("suri33213@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Qwerty");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(3000);
	boolean status = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
	if(status ==true)
	{
	driver.findElement(By.xpath("(//a[@href='https://tutorialsninja.com/demo/index.php?route=account/logout' and text()='Logout'])[2]")).click();
	Assert.assertTrue(true);
	}
	else
	{
	Assert.fail();
	}
}
}