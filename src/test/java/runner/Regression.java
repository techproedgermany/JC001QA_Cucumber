package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",   //creates reports on the console as well
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
        },
        monochrome = false,
        features = "./src/test/resources/features",     // provides path of the features folder
        glue = {"stepdefinitions", "hooks"},     //provides path of the step definitions folder and hooks folder
        dryRun = false,  // generates the missing step definitions, without running the existing step definitions
        tags = "@regression"
)
public class Regression {


}
