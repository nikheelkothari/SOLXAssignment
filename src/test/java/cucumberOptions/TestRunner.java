package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/Features/ParseJson.feature", 
		glue = { "stepDefinitions" },
		monochrome = true,
		plugin = { "json:target/JSONReports/report.json" }
		//tags="(@SmokeTest and @SmokeScenario) or @ImportantTest"
		)
public class TestRunner {

}
