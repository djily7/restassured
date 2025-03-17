package com.Day4Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day4HomeWork {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		//Switch to the first frame
		driver.switchTo().frame(0); 
		WebElement Frame1= driver.findElement(By.xpath("//input[@name='mytext1']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Welcome')", Frame1);
		driver.switchTo().defaultContent();  //Return to the main than we can use the second frame
		
		//Switch to the second frame
		driver.switchTo().frame(1);
		WebElement Frame2= driver.findElement(By.xpath("//input[@name='mytext2']"));
		js.executeScript("arguments[0].setAttribute('value','Selenium')", Frame2);
		driver.switchTo().defaultContent();
		
		//Switch to the third frame
		driver.switchTo().frame(2);
		WebElement Frame3= driver.findElement(By.xpath("//input[@name='mytext3']"));
		js.executeScript("arguments[0].setAttribute('value','Java')", Frame3);
		driver.switchTo().defaultContent();
	/*	
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//span[normalize-space()='I am a human']")).click();
		// how to handle intercepted exception
		WebElement rdaioButton= driver.findElement(By.xpath("//span[normalize-space()='I am a human']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", rdaioButton);
		driver.switchTo().defaultContent();
  */
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[@for='i9']")).click();
	}

}
