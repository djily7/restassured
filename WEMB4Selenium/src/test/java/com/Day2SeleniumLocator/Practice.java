package com.Day2SeleniumLocator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Practice {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
	}

	
	public void agent_enter_the_valid_and_valid(String email, String password) {
		 driver.findElement(By.id("username")).sendKeys(email);
		 driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("Agent click on submit")
	public void agent_click_on_submit() {
		driver.findElement(By.id("submit")).click();
	}
		
		WebElement Blogs = driver.findElement(By.xpath("//a[contains(text(),'Unlock Your Future: Selenium WebDriver Career Launcher Part 1')]"));
		Select Blog = new Select(Blogs);
		Blog.selectByVisibleText("Unlock Your Future: Selenium WebDriver Career Launcher Part 1");
		
		
		// is to look for the select tag 
		//WebElement ddCountry = driver.findElement(By.xpath("//select[@id='country']"));
		
		// then chose one option by making the select class 
		//Select s = new Select(ddCountry);
		// then we can chose option 1. by index 2. value  . 3. visible text
		//s.selectByIndex(2);
		
		//2. select by values
		//s.selectByValue("canada");
		
		//3. select by visible text
	//	s.selectByVisibleText("France");
		
		}
	}




