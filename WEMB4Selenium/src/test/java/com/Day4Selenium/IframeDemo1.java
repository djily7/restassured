package com.Day4Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String title= driver.getTitle();
		System.out.println(title);
		
		// in order to handle the frame we need to switch to the iframe
		WebElement  moneyFrameTag = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
		// to handle the frame we can use index name  , frame name or the web Element
		// three method of iframe   1.index name  2. frame name or id   3. webElement 
		driver.switchTo().frame(moneyFrameTag);
		String text = driver.findElement(By.cssSelector("span#nseindex")).getText();
		System.out.println(text);
		

	}

}
