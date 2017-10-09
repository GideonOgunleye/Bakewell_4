package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;		


@RunWith(Cucumber.class)

//@CucumberOptions(features="src/test/java/features",
//@CucumberOptions(features="features",
//plugin = {"pretty", "html:target/cucumber-html-report"},
//glue={"Sanity_Test"}
//tags={"@Login"}
@CucumberOptions (
		monochrome = true,
		features = "src/test/java/features", 
		//format={"pretty", "json:target/report.json"},
		plugin = {"pretty", "html:target/cucumber-html-report"},
		glue = "StepDefinition",
		tags = "@Login"
)
		
@Test 
public class Runner {
	
	

}
