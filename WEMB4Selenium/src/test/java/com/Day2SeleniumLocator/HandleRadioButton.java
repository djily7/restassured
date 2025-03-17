package com.Day2SeleniumLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement bmwradio = driver.findElement(By.id("bmwradio"));
		bmwradio.click();
		WebElement benzradio = driver.findElement(By.id("benzradio"));
		benzradio.click();
		WebElement hondaradio = driver.findElement(By.id("hondaradio"));
		hondaradio.click();
		
		
	WebElement bmw =	driver.findElement(By.id(""));
	bmw.clear();
		

	}

}
