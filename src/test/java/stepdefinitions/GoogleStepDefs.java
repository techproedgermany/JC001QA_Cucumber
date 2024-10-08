package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Google_Homepage;
import utilities.Driver;
import utilities.WaitUtils;


public class GoogleStepDefs {

    Google_Homepage googleHomepage = new Google_Homepage();

    @Given("user is on the google homepage")
    public void user_is_on_the_google_homepage() {
        Driver.getDriver().get("https://www.google.com/");
        WaitUtils.waitFor(2);

        // if there is a Google cookie popup
        try {
            googleHomepage.cookiePopUp.click();
        } catch (Exception e) {
        }
    }

    @Given("user search for iPhone")
    public void user_search_for_i_phone() {
        googleHomepage.searchBox.sendKeys("iPhone", Keys.ENTER);
        WaitUtils.waitFor(2);
    }

    @Then("verify the result contains iPhone")
    public void verify_the_result_contains_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
        WaitUtils.waitFor(2);
    }

    @Given("user search for teapot")
    public void user_search_for_teapot() {
        googleHomepage.searchBox.sendKeys("teapot", Keys.ENTER);
        WaitUtils.waitFor(2);
    }

    @Then("verify the result contains teapot")
    public void verify_the_result_contains_teapot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("teapot"));
        WaitUtils.waitFor(2);
    }

    ////// day31
    @Given("user search for {string}")
    public void user_search_for(String product) {
       googleHomepage.searchBox.sendKeys(product , Keys.ENTER);
        WaitUtils.waitFor(2);
    }


    /*
    *********** STEP DEFINITIONS **********
    * After we create our test Sceanrios, we need to generate step definitions to write our code
    * Use Runner to generate the missing step definitions
    * Use the templates and add them in your step definitions folder
    * Then complete your java code using page object modeling
    * @tags are used to run specific test scenarios. we can use multiple tags
     */
}
