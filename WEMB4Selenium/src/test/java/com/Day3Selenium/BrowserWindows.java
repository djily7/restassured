package com.Day3Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		// now we need to get ids of 2 windows
		Set<String> windowIds = driver.getWindowHandles();
		
		// interview question
		// 1. getWindowHandle &  getWindowHandles
		// 2.where you have used List or Set interface in your framework
		System.out.println(windowIds);
		
		// now we xtract id one by one
		
		// approch 1 only for 2 or 3 browser window
		List<String> windowList = new ArrayList(windowIds);
		String ParentWindow = windowList.get(0);
		System.out.println("This is the parent window:" + ParentWindow);
		
		String childtWindowId = windowList.get(1);
		System.out.println("This is the child window:" + childtWindowId); 
		// why we convert set into list --- there is not get() in set and  set is not index based
		System.out.println("This is the parent window title:" +driver.getTitle());
		// to switch the driver
		driver.switchTo().window(childtWindowId);
		System.out.println("This is the child window title :" +driver.getTitle());
		
		// approch 2 more tha 3 windows
		for (String wid:windowIds) {
			System.out.println(wid);
			String title = driver.switchTo().window(wid).getTitle();
			//System.out.println(title);
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		
		driver.quit();
		
		

	}

}
