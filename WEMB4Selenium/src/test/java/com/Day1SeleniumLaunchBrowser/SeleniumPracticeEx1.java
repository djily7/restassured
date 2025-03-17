package com.Day1SeleniumLaunchBrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class SeleniumPracticeEx1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		// other way to execute  simple way
		//driver.findElement(By.name("userName")).sendKeys("Admin"); 
		//driver.findElement(By.name("password")).sendKeys("password");
		//driver.findElement(By.name("submit")).click();
		//Thread.sleep(3000);
		
		//File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(f, new File("C:\\Users\\djily\\Downloads\\Screenshot\\guru99.jpg"));  //take  screenshot and storing in file by choise
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\djily\\eclipse-workspace\\WEMB4Selenium\\target\\SceenShot\\guru99.jpg"));
		
		driver.close();
		driver.quit();
		
		

	}

}
