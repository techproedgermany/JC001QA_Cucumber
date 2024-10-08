package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",     // provides path of the features folder
        glue = {"stepdefinitions"},     //provides path of the step definitions folder
        dryRun = false,  // generates the missing step definitions, without running the existing step definitions
        tags = "@scenario_outline"
)

public class Runner {

    /*
    ************* RUNNER CLASS ************
    * Runner class is used to run the feature files
    * And to report plugins
    * Runner class is used to connect the JAVA (step definitions) and NON-JAVA(featurefiles) parts
    * @RunWith(Cucumber.class) makes the Runner class runnable
    * @CucumberOptions is used to connect the feature files with their step definitions.
    *   It is also used for configurations and report plugins
    *       features => provides path of the features folder
    *       glue is used to connect feature file with it step definitions
    *       dryRun => false must be used to run the tests normally
    *       @tags is used to run specific test scenarios
     */

}
