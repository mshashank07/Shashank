package tests;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@Cucumber.Options( format={"pretty","html:target/cucumber", "json-pretty:target/cucumber-report.json"} )



public class TestRunner {
	
}

