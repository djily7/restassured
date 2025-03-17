package com.Day2SeleniumLocator;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HomeWorkCheckBoxes {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement bmwcheck = driver.findElement(By.id("bmwcheck")); // check the boxe  BMW and send my name
		bmwcheck.click();
		Thread.sleep(3000);
		WebElement benzcheck = driver.findElement(By.id("benzcheck")); // check the boxe  BENZ and send my name
		benzcheck.click();
		WebElement hondacheck = driver.findElement(By.id("hondacheck")); // check the boxe  HONDA and send my name
		hondacheck.click();
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Djilali"); 
		
		// take screenshot 
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\djily\\eclipse-workspace\\WEMB4Selenium\\target\\SceenShot\\Ex3.jpg"));
		
		driver.close();
		driver.quit();
		
	
	}

}
