package com.Day5SeleniumTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOrangeHRM {
	
	WebDriver driver;
	@BeforeMethod
	void openApp() {
	
	driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
}
	//@Test(priority=1)
	void getTitle() throws InterruptedException {
		Thread.sleep(2000);
		String Title = driver.getTitle();
		System.out.println("This is the title for Orange HRM App :" +Title);
	}
	//@Test (priority=2)
	void getLogo() throws InterruptedException {
		Thread.sleep(2000);
		boolean logoDisplayed = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("The logo is displaying " + logoDisplayed);
	}
	@Test(priority=3)
	void LoginToTheApp() throws InterruptedException {
		Thread.sleep(2000);
		WebElement usenameInput = driver.findElement(By.xpath("//input[@name='username']"));
		usenameInput.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
		passwordInput.sendKeys("admin123");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();		
	} 
	@Test (priority=4)
	void LogoutFromTheApp() throws InterruptedException {
		LoginToTheApp();
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        WebElement dropdown = driver.findElement(By.xpath("//ul[@role='menu']//li"));
        System.out.println(dropdown);
        
    List<WebElement> li = driver.findElements(By.xpath("//ul[@role='menu']//li"));
		System.out.println(li.size());
		for(WebElement l: li)
		{
			System.out.println(l.getText());
			if(l.getText().equals("Logout"))
			{
				l.click();	
			}
		}
        
	}	
        	
	
	@AfterMethod
	void closeApp() {
		
	}
	
	
}
