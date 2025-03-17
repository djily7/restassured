package PageClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class QaFoxDesktopTablets {
	
	WebDriver rdriver;
	public QaFoxDesktopTablets(WebDriver cdriver) {
	
		rdriver=cdriver;
		PageFactory.initElements(cdriver, this);
	}
	// Click on "Tablets"
	@FindBy(xpath="(//a[contains(text(),'Tablets')])[1]")
	WebElement clickonTable;
	
	 //Click on Desktop
	@FindBy(xpath="//a[normalize-space()='Desktops (13)']")
	WebElement clickDesktop;
	
	// Count links on Tablets page
		@FindBy(tagName="a")
		WebElement countHowManyLinck;
		
	// Click on "Tablets"
	public void clickonTable() {
		clickonTable.click();
	}
    
    // Click on "Desktop"
	public void clickDesktop() {
		clickDesktop.click();
	}
	
    // Count links on Desktop page
	public int countDesktopLinks() {
		List<WebElement> desktopLinks = rdriver.findElements(By.tagName("img"));
		System.out.println("Number of links on  page: " + desktopLinks.size());
		return desktopLinks.size();
		
		
	        
	     
	}
}
