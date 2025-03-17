package com.Day1SeleniumLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// webDriver in an interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// name locators
		Thread.sleep(3000);
		//driver.findElement(By.name("username")).sendKeys("Admin"); // sendKeys is method we use to send the  input box
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//the return type of findElement is webElement    in real work we follow this approch
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin123");
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginBtn.click();
		
		
		driver.quit();

	}

}
