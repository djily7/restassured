package TestRunnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // add junit dep
@CucumberOptions(
		//features="src/test/java/features/AccountPage.feature",
		features = "src/test/java/features/DesktopTablets.feature",
		glue = { "Stepdefinitions" },
		
		//plugin = {"pretty","html:target/HtmlReports.html"})
		plugin = { "pretty", "junit:target/myReports/report.html" }, 
		publish = true)

public class TestRunner {

}
