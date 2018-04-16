package driver;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(strict = false, features = "TestCases",glue = { "stepdefination" }, plugin = { "pretty",
    "json:target/cucumber.json" }, tags = { "~@ignore" }
//,dryRun = true
		)

public class TestRunner {

}
