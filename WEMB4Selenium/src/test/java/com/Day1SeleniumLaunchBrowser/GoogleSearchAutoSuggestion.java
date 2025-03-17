package com.Day1SeleniumLaunchBrowser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutoSuggestion {
  
	private static int i;

	public static void main(String[] args) throws InterruptedException {
		// //ul[@role= 'listbox']//li//div[@role='option']
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement googleSearchInput = driver.findElement(By.name("q"));
		googleSearchInput.sendKeys("Selenium");
		
		List<WebElement> ListSuggestion = driver.findElements(By.xpath("//ul[@role= 'listbox']//li//div[@role='option']"));
		System.out.println(ListSuggestion.size());
		for(int i=0; i<ListSuggestion.size(); i++) {
		if(ListSuggestion.get(i).getText().equals("selenium foods")) {
			ListSuggestion.get(i).click();
			Thread.sleep(3000);
			break;	
		}

	}
	}
}
