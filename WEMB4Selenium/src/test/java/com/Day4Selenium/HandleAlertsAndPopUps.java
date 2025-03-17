package com.Day4Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertsAndPopUps {

	public static void main(String[] args) throws InterruptedException {
		/*Alerts are popups boxes that take our focus away from the browser and  force us to read the alert message
		 * we have to do some action such as accept or dismiss the alert box to resume task on the browser
		 * if the alertis present in the webpage and we try to access any of the element on the page without handling the alert
		 * wil throw " UnhandledAlertException"
		 * Types of alerts----3 types
		 * 1. simple alert
		 * 2. confirmation alert
		 * 3. prompt alert 
		 * 
		 * 1.simple alert is the type of alert that displays some information or warning on the screen 
		 * --only has OK button
		 * 2. confirmation alert .. type of alert comes with an option to accept or dismiss
		 *   -the 2 methods --accept() & Alert.dismiss()
		 *  3. prompt alert this alert has an option to add text to the alert box
		 *  this alert is required when some input needed from the user and
		 *  we use sendkey() . to type the value in the prompt alert box
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String title= driver.getTitle();
		System.out.println(title);
		
		// handle simple alert with ok use Alert interface and switch to alert and store alert object
		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//Alert myalert= driver.switchTo().alert();
		//System.out.println(myalert.getText());
		//myalert.accept();
		//Thread.sleep(3000);
		
		// to check the explicit wait 
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));

		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert myalert = w.until(ExpectedConditions.alertIsPresent());
		myalert.accept();


		
		//2. confirmation alert  has two option ok and cancel
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
		//3. prompt alert we have to send text
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert myalert2 =driver.switchTo().alert();
		myalert2.sendKeys("Today is runing sunday");
		myalert2.accept();
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
