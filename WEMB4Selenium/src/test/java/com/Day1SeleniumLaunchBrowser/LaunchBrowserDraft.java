package com.Day1SeleniumLaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class LaunchBrowserDraft {

	private static final char[] PageSource = null;

	public static void main(String[] args) throws InterruptedException {
		// get() methods--- we can access this method using Webdrivr instance
		/* 1. get(url)
		 * 2. getTitle()
		 * 3. geCurrentUrl()
		 * 4. getPageSource()
		 * 5. getWindowHandle  .  getWindowsHwndles
		 */
		
		WebDriver driver =new  ChromeDriver();
		//WebDriver driver =new  EdgeDriver();
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.quit();
		
	
	
		

	}

}
