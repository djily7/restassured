package com.Day2SeleniumLocator;
                                                        

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// is to look for the select tag 
		WebElement ddCountry = driver.findElement(By.xpath("//select[@id='country']"));
		
		// then chose one option by making the select class 
		Select s = new Select(ddCountry);
		// then we can chose option 1. by index 2. value  . 3. visible text
		//s.selectByIndex(2);
		
		//2. select by values
		//s.selectByValue("canada");
		
		//3. select by visible text
		s.selectByVisibleText("France");
		
		List<WebElement> countryOptions = s.getOptions();
		System.out.println(countryOptions.size());
		
		// print all options
		//for (int i=0; i<countryOptions.size(); i++) {
		//	System.out.println(countryOptions.get(i).getText());
		}
	}

//}
