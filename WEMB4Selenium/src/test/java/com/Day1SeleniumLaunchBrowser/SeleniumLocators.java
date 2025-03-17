package com.Day1SeleniumLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumLocators {
	/*
	 * 1. name
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver =new  EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		// name Locator 
		//driver.findElement(By.name("field-keywords")).sendKeys("macbook");
		//Thread.sleep(3000);
		// ID  Locator
		//driver.findElement(By.id("small-searchterms")).sendKeys("Tarif");
		//Thread.sleep(3000);
		// Link Locator
	    //driver.findElement(By.linkText("Tablet")).click();
		//Thread.sleep(3000);
		
		//driver.quit();

	}

}
