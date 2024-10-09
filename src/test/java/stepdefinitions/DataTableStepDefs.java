package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTable_HomePage;
import utilities.WaitUtils;

public class DataTableStepDefs {

    DataTable_HomePage dataTable_homePage = new DataTable_HomePage();

    @And("user clicks on New button")
    public void userClicksOnNewButton() {
        dataTable_homePage.newButton.click();
    }

    @And("user enters first name as {string}")
    public void userEntersFirstNameAs(String first_name) {
        dataTable_homePage.firstName.sendKeys(first_name);
    }

    @And("user enters last name as {string}")
    public void userEntersLastNameAs(String last_name) {
        dataTable_homePage.lastName.sendKeys(last_name);
    }

    @And("user enters position as {string}")
    public void userEntersPositionAs(String position) {
        dataTable_homePage.position.sendKeys(position);
    }

    @And("user enters office as {string}")
    public void userEntersOfficeAs(String office) {
        dataTable_homePage.office.sendKeys(office);
    }

    @And("user enters extension as {string}")
    public void userEntersExtensionAs(String extension) {
        dataTable_homePage.extension.sendKeys(extension);
    }

    @And("user enters start date as {string}")
    public void userEntersStartDateAs(String start_date) {
        dataTable_homePage.startDate.sendKeys(start_date);
    }

    @And("user enters salary as {string}")
    public void userEntersSalaryAs(String salary) {
        dataTable_homePage.salary.sendKeys(salary);
    }

    @And("user clicks on Create button")
    public void userClicksOnCreateButton() {
        dataTable_homePage.createButton.click();
    }

    @Then("verify that the name field contains {string}")
    public void verifyThatTheNameFieldContains(String first_name) {
        dataTable_homePage.searchBox.sendKeys(first_name);
        Assert.assertTrue(dataTable_homePage.verifyNameField.getText().contains(first_name));
    }
}
