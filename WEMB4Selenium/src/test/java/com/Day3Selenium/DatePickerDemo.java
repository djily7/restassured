package com.Day3Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// first we need to switch to frame then we can handle date picker element 
		driver.switchTo().frame(0);
		
		// method one to send date  index
	//	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/05/2025");
		
		// method 2  using date picker
		// expaected dat
		String year = "2027";
		String month= "february";
		String date = "14";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		// select month and year using  while loop
		while(true) {
			String currMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// return actual month
			String currYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // return actual year
			if(currMonth.equals(month) && currYear.equals(year) ) {
				break;
			}	
		//handle previous button
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		//driver.quit();
		}
		// select all dates
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:allDates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

}
