package Stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageClass.QaFoxDesktopTablets;
import PageClass.QaFoxEditAcountInfo;
import PageClass.QaFoxLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QaFoxLoginStep {
	
	public WebDriver driver;
	public QaFoxLoginPage qp;
	public QaFoxEditAcountInfo ap;
	public QaFoxDesktopTablets dp;
	
	@Given("the qa open the google chrome")
	public void the_qa_open_the_google_chrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 // need to provide memory to qp
		qp = new QaFoxLoginPage(driver);
		ap = new QaFoxEditAcountInfo(driver);
		dp = new QaFoxDesktopTablets(driver);
		
	}

	@When("the qa go the URL {string}")
	public void the_qa_go_the_url(String url) {
	    driver.get(url);
	}

	@When("the qa entered email as {string} and password {string}")
	public void the_qa_entered_email_as_and_password(String email, String password) {
	   qp.enterEmail(email);
	   qp.enterPassword(password);
	}

	@When("the qa click on the log in button")
	public void the_qa_click_on_the_log_in_button() {
		qp.clickLoginBtn();
	   
	}
	@Then("the qa validate that my account is displayed")
	public void the_qa_validate_that_my_account_is_displayed() {
	    qp.MyAccountTextStatus();
	    driver.quit();
	}
//****************************** steps for account page***************************
	@When("qa click the edit button")
	public void qa_click_the_edit_button() {
	  ap.clickbtEdit();
	}

	@Then("qa able to see personal detail")
	public void qa_able_to_see_personal_detail() {
	    ap.PersonalDetailTextValidation();
	}
	
	@When("qa edit {string} and phone {string}")
	public void qa_edit_and_phone(String email, String phone) {
	   ap.sendemail(email);
	   ap.sendphone(phone);
	   ap.contbtn();
	}
	@Then("qa validate succes message")
	public void qa_validate_succes_message() {
	    ap.succesmsg();
	}
	//****************************** steps for  DESKTOP TABLETS page***************************

	@Given("qa click on tablets")
	public void qa_click_on_tablets() {
	   dp.clickonTable();
	}

	@When("qa click on desktop")
	public void qa_click_on_desktop() {
	  dp.clickDesktop();
	}

	@Then("count how many links")
	public void count_how_many_links() {
		dp.countDesktopLinks();
			
	}


}
