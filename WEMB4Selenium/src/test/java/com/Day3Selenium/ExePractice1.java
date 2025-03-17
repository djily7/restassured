package com.Day3Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExePractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); // we to inspect usename
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); // we to inspect password
		driver.findElement(By.id("login-button")).click(); // we to inspect id
		// switch to product page  
		String currentWindowHandle = driver.getWindowHandle();
		System.out.println(currentWindowHandle);
		driver.switchTo().window(currentWindowHandle); // this command will switch the driver
		
		driver.findElement(By.linkText(currentWindowHandle));
	


	}

}
