package com.Day1SeleniumLaunchBrowser;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		// implicitly wait
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// get() we are passing url as String  ( we are passing just url)
		// navigate method --- we can pass url as String as well as object (we are passing both)
		URL myurl = new URL("https://www.google.com/"); 
		// navigate ()---- it will internelly call get method but before calling get method it will check if it is string then it will pass
		// else it will convert to string
		driver.navigate().to(myurl);
		driver.manage().window().maximize();
		
		// get() and navigation  on the same time 
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		
	}

}
