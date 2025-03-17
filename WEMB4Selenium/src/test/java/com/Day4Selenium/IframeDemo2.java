package com.Day4Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement f1 = driver.findElement(By.cssSelector("iframe#frame1"));
		// switch to the frame
		driver.switchTo().frame(f1);
		WebElement f2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(f2);
		String text = driver.findElement(By.xpath("//*[contains(text(),'Child Iframe')]")).getText();
		if(text.contains("Child Iframe")) {
		System.out.println("test case pass");
		}else {
		System.out.println("fail");
		}
		driver.quit();

	}

}
