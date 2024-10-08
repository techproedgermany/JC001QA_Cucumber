package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Google_Homepage;
import utilities.Driver;
import utilities.WaitUtils;

public class CommonStepDef {

    Google_Homepage googleHomepage = new Google_Homepage();

    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        Driver.getDriver().get(url);
        WaitUtils.waitFor(2);

        // if there is a Google cookie popup
        try {
            googleHomepage.cookiePopUp.click();
        } catch (Exception e) {
        }
    }

    @Then("verify the result contains {string}")
    public void verify_the_result_contains(String product) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(product));
        WaitUtils.waitFor(2);
    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }
}
