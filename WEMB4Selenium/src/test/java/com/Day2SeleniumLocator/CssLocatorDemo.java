package com.Day2SeleniumLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorDemo {

	public static void main(String[] args) {
		// open browser
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // put the wait
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();  // maximazed the browser
		
		// css Selector  Cascading Style Sheets
		// approch 1 - tag & id so we are writing css for search window
		// input#small-searchtems
		WebElement searchBox = driver.findElement(By.cssSelector("input#small-searchterms"));
	    searchBox.sendKeys("Mostapha");                        //    tag       ID
		
		// approch 2 tag-class name for class name we use .Class name
		//WebElement searchBox = driver.findElement(By.cssSelector("input.search-box-text"));
		//searchBox.sendKeys("Nura");                                TAG   CLASS NAME
		
		// approch 3 tag & attribute
		//WebElement searchBox = driver.findElement(By.cssSelector("input[id='small-searchterms']"));
		//searchBox.sendKeys("Sahar");                           //  TAG    ATTRIBUTE   
		
		
		//driver.quit();
		
		
	}

}
