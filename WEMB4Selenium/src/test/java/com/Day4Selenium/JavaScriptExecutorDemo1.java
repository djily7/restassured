package com.Day4Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		WebElement inputboxname =  driver.findElement(By.xpath("//input[@id='name']"));
		// webDriver and javascript interface has no relationship so we need to use Typecasting 
		//JavascriptExecutor jr = driver;
		JavascriptExecutor js =(JavascriptExecutor)driver; // child class object storing the parent class objt
		js.executeScript("arguments [0].setAttribute('value', 'Sahar')", inputboxname);
		
		WebElement MaleRadio =  driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments [0].click()", MaleRadio);
		//driver.quit();
	}

}
