package com.Day6Selenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/* action class
 * allow us to perform multiple actions at the same time: like double click, right click, drag and drop mouse hover
 * has a built-in ability to handle various types for keyboard and mouse events
 * can be found in org.openqa.selenium.interactions.Actions package
 * actions interface: provide us useful method-- perform()-- this method is implemented by action class
 * build()  this method of actions class used to create chain of action or operations we want to perform
 * perform()   execute chain of action which are build using build()
 */


@Test
public class SeleniumActionClass {
	WebDriver driver;
	@BeforeMethod
	void openApp() {	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
	}
	//@Test
	public void testone() {
		Actions a = new Actions(driver);
		WebElement doubleclickAction = driver.findElement(By.id("doubleClickBtn"));
		// Double Click
		a.doubleClick(doubleclickAction).build().perform();
		// grab the double click message
		String msg = driver.findElement(By.id("doubleClickMessage")).getText();
		System.out.println("This is the after double click message:"+msg);
		if(msg.contains("double click")) {
			System.out.println("Double click test  case passed");
		}else {
		System.out.println("Double action test case failed");
		}
	}
	//@Test
	public void testTwo() throws InterruptedException {
		Actions a = new Actions(driver);
		
		WebElement rightClickAction =  driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		JavascriptExecutor js =(JavascriptExecutor)driver; // child class object storing the parent class objt
		js.executeScript("arguments [0].scrollIntoView();", rightClickAction);
		Thread.sleep(2000);
		// right Click
		a.contextClick(rightClickAction).build().perform();
		// grab the right click message
		String msgRightClick = driver.findElement(By.id("rightClickMessage")).getText();
		System.out.println("This is the after right click message:"+msgRightClick);
		if(msgRightClick.contains("right click")) {
			System.out.println("Right click test  case passed");
		}else {
		System.out.println("Right action test case failed");
		}
	}
	//@Test
	public void testThree() {
		Actions a = new Actions(driver);
		WebElement simpleclickAction = driver.findElement(By.xpath("//button[text()='Click Me']"));
		JavascriptExecutor js =(JavascriptExecutor)driver; 
		js.executeScript("arguments [0].scrollIntoView();", simpleclickAction);
		js.executeScript("arguments [0].click();", simpleclickAction);
		
		// simple Click
		a.doubleClick(simpleclickAction).build().perform();
		// grab the simple  click message
		String msg = driver.findElement(By.id("dynamicClickMessage")).getText();
		System.out.println("This is the afterright click message:"+msg);
		if(msg.contains("dynamic click")) {
			System.out.println("simpleclick test  case passed");
		}else {
		System.out.println("simpleaction test case failed");
		}
	}
	//@Test
	public void testFour() {
		String url = "https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/";
		driver.get(url);
		Actions a = new Actions(driver);
		// min slider
		WebElement min_slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 0%;']"));
			System.out.println("Location :"+min_slider.getLocation());
		// i want to move down the rd
			a.dragAndDropBy(min_slider,200,294).build().perform();
			System.out.println("Location :"+min_slider.getLocation());
		// max slider 
		WebElement max_slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 100%;']"));
			System.out.println("Location of min_slider before moving :"+max_slider.getLocation());
		// i want to move -100 down the rd
			a.dragAndDropBy(max_slider,-40,250).build().perform();
			System.out.println("Location of max_slider before moving:"+max_slider.getLocation());		
	}	
	
	public void testFive() {
		String newurl = "https://text-compare.com/";
		driver.get(newurl);
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Selenium is perfect tool for automation");
		// CTRL A
		a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		//CTRL C
		a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		// PRESS TAB
		a.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		// CTRL V
		a.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
	}
	public void testsix() throws InterruptedException {
		
		String url = "https://jqueryui.com/droppable/#photo-manager";
		driver.get(url);
		
		Actions a = new Actions(driver);
		WebElement f = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(f);
		
		WebElement p1 = driver.findElement(By.xpath("//ul[@id='gallery']//li[1]"));
		Thread.sleep(1500);	
		WebElement p2 = driver.findElement(By.xpath("//ul[@id='gallery']//li[2]"));
		Thread.sleep(1500);
		WebElement p3 = driver.findElement(By.xpath("//ul[@id='gallery']//li[3]"));
		Thread.sleep(1500);	
		WebElement p4 = driver.findElement(By.xpath("//ul[@id='gallery']//li[4]"));
		Thread.sleep(1500);
		
		WebElement  target = driver.findElement(By.id("trash"));
		
		a.dragAndDrop(p1, target).build().perform();
		Thread.sleep(1500);
		a.dragAndDrop(p2, target).build().perform();
		Thread.sleep(1500);
		a.dragAndDrop(p3, target).build().perform();
		Thread.sleep(1500);
		a.dragAndDrop(p4, target).build().perform();
		Thread.sleep(1500);
		
		List<WebElement> pics = driver.findElements(By.xpath("//ul[@class='gallery ui-helper-reset']//li"));
		int size = pics.size();
		System.out.println(size);
		if(pics.size() !=0) {
			System.out.println("Test case pass");
		}
		int ActualSize = pics.size();
		int expectedSize = 4;
		Assert.assertEquals(ActualSize, expectedSize,"All the pict are not moved to target");
		
		
	}
	@Test
	public void testseven() throws InterruptedException {

	String url = "https://jqueryui.com/droppable/#photo-manager";
	driver.get(url);
	Actions a = new Actions(driver);
	WebElement f = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(f);
	WebElement p1 = driver.findElement(By.xpath("//ul[@id='gallery']//li[1]"));
	Thread.sleep(1500);

	WebElement p2 = driver.findElement(By.xpath("//ul[@id='gallery']//li[2]"));
	Thread.sleep(1500);

	WebElement p3 = driver.findElement(By.xpath("//ul[@id='gallery']//li[3]"));
	Thread.sleep(2000);

	WebElement p4 = driver.findElement(By.xpath("//ul[@id='gallery']//li[4]"));
	Thread.sleep(1500);

	WebElement target = driver.findElement(By.id("trash"));

	a.clickAndHold(p1).moveToElement(target).release().build().perform();
	Thread.sleep(1500);
	a.clickAndHold(p2).moveToElement(target).release().build().perform();
	Thread.sleep(1500);
	a.clickAndHold(p3).moveToElement(target).release().build().perform();
	Thread.sleep(1500);
	a.clickAndHold(p4).moveToElement(target).release().build().perform();
	Thread.sleep(1500);

	List<WebElement> pics = driver.findElements(By.xpath("//ul[@class='gallery ui-helper-reset']//li"));
	int size = pics.size();
	System.out.println(size);
	if(pics.size()!=0) {
	System.out.println("TEst case pass");
	}
	int ActualSise = pics.size();
	int expectedSize = 4;
	Assert.assertEquals(expectedSize, ActualSise, "All the pictures are not get moved to target");
	}
	
	@Test
	public void testhuit()  throws InterruptedException, AWTException {

		String url = "https://demoqa.com/upload-download";
		driver.get(url);
		WebElement chooseFileBtn = driver.findElement(By.id("uploadFile"));
		Actions a = new Actions(driver);
		a.moveToElement(chooseFileBtn).click().perform();
		Robot rb = new Robot();
		rb.delay(2000);

		// the file need to be copy
		StringSelection ss = new StringSelection("C:\\Users\\djily\\OneDrive\\Desktop\\abc.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// these above 2 lines will copy the file to the clipboard

		// perform the ctrl v to past the file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// NOW RELAESE

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// now we need to enter

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	}
	
	void closeApp() {
		
		}
	}
	
	

