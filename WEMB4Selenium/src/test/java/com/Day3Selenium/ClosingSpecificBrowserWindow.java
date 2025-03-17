package com.Day3Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

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
		
		for (String wid:windowIds) {
			System.out.println(wid);
			String title = driver.switchTo().window(wid).getTitle();
			//System.out.println(title);
			if(title.equals("OrangeHRM")) {
				driver.close();

	}
		}
	}
}
