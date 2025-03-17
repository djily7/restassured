package com.Day5Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement nameInput =  driver.findElement(By.xpath("//input[@id='name']"));
		// want to send text without using sendKey method
		JavascriptExecutor js =(JavascriptExecutor)driver; // child class object storing the parent class objt
		js.executeScript("arguments [0].setAttribute('value', 'Daniel')", nameInput);
		
		// scrolling  bar is not part of website so we use javascript  js
		//js.executeScript("window.scrollBy(0,2000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset; "));
		
		// scroll doing bar to pagination table 
		WebElement webTablePagination = driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
		js.executeScript("arguments[0].scrollIntoView();",webTablePagination);
		
		// zoom in 
		js.executeScript("document.body.style.zoom='50%'");
		// zoom out
				js.executeScript("document.body.style.zoom='150%'");
		
	}

}
