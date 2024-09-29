package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features",
		glue={"stepdefinitions","Hooks"},
		//plugin= {"pretty","html:target/CucumberReport.html"}
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"pretty","html:target/CucumberReport.html"}
		)
public class runnerTest extends AbstractTestNGCucumberTests {
	
	

}