package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BlueRental_LoginPage;

import java.util.List;

public class BlueRentalStepDef {


    BlueRental_LoginPage blueRentalLoginPage = new BlueRental_LoginPage();

    @When("user enters admin email and password")
    public void user_enters_admin_email_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<String> credentials = dataTable.row(1);  //index starts at 0
        // System.out.println("credentials = " + credentials);  //[jack1@gmail.com,12345 ]
        blueRentalLoginPage.email.sendKeys(credentials.get(0));  //sends email dynamically
        blueRentalLoginPage.password.sendKeys(credentials.get(1));  //sends password dynamically
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        blueRentalLoginPage.loginButton.click();
    }
    @Then("verify login is successful")
    public void verify_login_is_successful() {
        Assert.assertTrue(blueRentalLoginPage.adminProfile.getText().contains("Jack Nickolson"));
        //Assert.assertEquals("Jack Nickolson", blueRentalloginPage.adminProfile.getText());

    }
}
