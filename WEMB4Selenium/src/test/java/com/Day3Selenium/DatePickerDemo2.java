package com.Day3Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	
		// future dates
		static void selectFutureDate(WebDriver driver, String year, String month,String date) {
		while(true) {
		String currMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// RETURN ACTUAL MONTH
		String currYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// RETURN ACTUAL YEAR
		if(currMonth.equals(month)&& currYear.equals(year) ) {
		break;
		}

		// handle next button
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
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
		// prev dates
		static void selectPrevDate(WebDriver driver, String year, String month,String date) {
		while(true) {
		String currMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// RETURN ACTUAL MONTH
		String currYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// RETURN ACTUAL YEAR
		if(currMonth.equals(month)&& currYear.equals(year) ) {
		break;
		}

		// handle previous button
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
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

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// ist we need to switch to the frame then we can handle date picker element
		driver.switchTo().frame(0);
		//method 1 to send the date
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/24/2025");

		// method 2 using date picker
		// expected data
		String year = "2027";
		String month = "February";
		String date = "14";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//selectFutureDate(driver,year,month,date);
		selectPrevDate(driver,year,month,date);

		}



	}


