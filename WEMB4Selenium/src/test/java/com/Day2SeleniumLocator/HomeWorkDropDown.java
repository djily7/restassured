package com.Day2SeleniumLocator;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class HomeWorkDropDown {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		// look for the select tag 
		WebElement carselect = driver.findElement(By.xpath("//select[@id='carselect']"));
		
		Select car = new Select(carselect);
		//car.selectByVisibleText("Benz"); 
		car.selectByValue("bmw");
		car.selectByValue("benz");
		car.selectByValue("honda");
		
		File f =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\djily\\eclipse-workspace\\WEMB4Selenium\\target\\SceenShot\\practice.jpg"));



	}

}
