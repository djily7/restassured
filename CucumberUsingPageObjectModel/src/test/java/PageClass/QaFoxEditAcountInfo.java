package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaFoxEditAcountInfo {
	
	WebDriver ldriver;
	public QaFoxEditAcountInfo(WebDriver rdriver ){

	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//a[text()='Edit your account information']")
	WebElement clickbtEdit;

	@FindBy(id="input-email")
	WebElement email;

	@FindBy(id="input-telephone")
	WebElement phone;

	@FindBy(xpath="//input[@value='Continue']")
	WebElement contbtn;
	
	@FindBy(xpath="//legend[text()='Your Personal Details']")
	WebElement PersonalDetailText;
	
	//div[text()='Success: Your account has been successfully updated.']
	@FindBy(xpath="//div[text()='Success: Your account has been successfully updated.']")
	WebElement succesmsg;
	
	// these are methods to interact with web element 
	public void clickbtEdit() {
	clickbtEdit.click();;
	}
	
	public void PersonalDetailTextValidation() {
		boolean pDetail = PersonalDetailText.isDisplayed();
		System.out.println(pDetail);
		}

	public void sendemail(String email1) {
	email.clear();
	email.sendKeys(email1);
	}

	public void sendphone(String phone1){
	phone.clear();
	phone.sendKeys(phone1);
	}

	public void contbtn(){
	contbtn.click();
	}
	
	public void succesmsg() {
	boolean TaostMsg = succesmsg.isDisplayed();
	System.out.println(TaostMsg);
	
	}
}



