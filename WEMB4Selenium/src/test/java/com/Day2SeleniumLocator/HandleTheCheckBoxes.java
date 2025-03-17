package com.Day2SeleniumLocator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTheCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// //input[@class='form-check-input' and @type='checkbox']
		List<WebElement> daysCheckBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(daysCheckBoxes.size());
		for(int i=0; i<daysCheckBoxes.size(); i++) {
			daysCheckBoxes.get(i).click();
			
		
	  // for(int i=0; i<3; i++) { // get the 3 first
		//	daysCheckBoxes.get(i).click();
			
		} 
	  for(int i=0; i<daysCheckBoxes.size(); i++) {
		  if(daysCheckBoxes.get(i).isSelected()) {
			   daysCheckBoxes.get(i).click();
	  }
	   
	   }
		
		//for(int i=4; i<daysCheckBoxes.size(); i++) {  // if we want to check just the last 3
		//	daysCheckBoxes.get(i).click();
		//}
		//driver.quit();

	}

}
