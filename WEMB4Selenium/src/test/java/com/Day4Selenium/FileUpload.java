package com.Day4Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String title= driver.getTitle();
		System.out.println(title);
		// single file to upload
		//driver.findElement(By.cssSelector("#filesToUpload")).sendKeys("C:\\Users\\djily\\OneDrive\\Desktop\\This will upload.txt");
		// file upload validation
		//if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("This will upload.txt")){
		//System.out.println("File is uploaded and my test case passed");	
		//}else {
		//	System.out.println("My test case failed");
		//}
		
		// multiple file upload
			String f1 = "C:\\Users\\djily\\OneDrive\\Desktop\\This will upload.txt";
			String f2 = "C:\\Users\\djily\\OneDrive\\Desktop\\Multiple file.txt";
			driver.findElement(By.cssSelector("#filesToUpload")).sendKeys(f1+"\n"+f2);
			// for validation
			int numberoffilesuploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
			//if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("This will upload.txt")) {
				if (numberoffilesuploaded ==2) {
					System.out.println("Files are uploaded and my test case passed");
				}else {
					System.out.println("My test case failed");
			
			}
				//System.out.println(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("FileToUpload.txt"));
				//System.out.println(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Sunday afternoon class.txt"));
				if((driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("This will upload.txt"))&&driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Multiple file.txt")) {
				System.out.println("All the files names are matching");	
			}else {
				System.out.println("All the files names are not  matching");
			}driver.quit();
    	}
	}

