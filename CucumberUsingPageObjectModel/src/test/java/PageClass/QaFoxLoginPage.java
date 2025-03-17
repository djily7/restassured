package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaFoxLoginPage {
	
	WebDriver ldriver;
	
	public QaFoxLoginPage(WebDriver rDriver) {
		ldriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	@FindBy(id= "input-email")
	WebElement email;
	
	@FindBy(id= "input-password")
	WebElement password;
	
	@FindBy(xpath= "//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath= "//h2[text()='My Account']")
	WebElement MyAccountText;
	
	public void enterEmail (String em) {
		email.sendKeys(em);	
	}
	public void enterPassword (String pw) {
		password.sendKeys(pw);		
	}
	public void clickLoginBtn () {
		loginBtn.click();	
	}
	public void MyAccountTextStatus() {
		System.out.println(MyAccountText.isDisplayed());
	}
	

}
