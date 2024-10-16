package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Medunna_RegistrationPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.util.List;

public class MedunnaRegistrationStepDefs {
    Medunna_RegistrationPage medunnaRegistrationPage = new Medunna_RegistrationPage();

    @When("user provides the following valid details")
    public void userProvidesTheFollowingValidDetails(io.cucumber.datatable.DataTable dataTable) {
        List<String> registerData = dataTable.row(1);
        medunnaRegistrationPage.ssn.sendKeys(registerData.get(0));
        medunnaRegistrationPage.firstname.sendKeys(registerData.get(1));
        medunnaRegistrationPage.lastname.sendKeys(registerData.get(2));
        medunnaRegistrationPage.username.sendKeys(registerData.get(3));
        medunnaRegistrationPage.email.sendKeys(registerData.get(4));
        medunnaRegistrationPage.password.sendKeys(registerData.get(5));
        medunnaRegistrationPage.passwordReenter.sendKeys(registerData.get(6));
    }

    @And("user clicks on Register button")
    public void userClicksOnRegisterButton() {
        JSUtils.JSscrollIntoView(medunnaRegistrationPage.registerButton);
        WaitUtils.waitFor(1);
        medunnaRegistrationPage.registerButton.click();

    }

    @Then("verify the {string} message is displayed")
    public void verifyTheMessageIsDisplayed(String expectedMessage) {
        WaitUtils.waitForVisibility(medunnaRegistrationPage.toastNotification, 2);
        Assert.assertTrue(medunnaRegistrationPage.toastNotification.getText().contains(expectedMessage));
        // Assert.assertTrue(medunnaRegistrationPage.toastNotification.isDisplayed());
    }
    @When("user enters SSN field {string}")
    public void userEntersSSNField(String ssn) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.ssn,ssn,2);

    }

    @And("user enters firstname {string}")
    public void userEntersFirstname(String firstname) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.firstname,firstname,2);

    }

    @And("user enters lastname {string}")
    public void userEntersLastname(String lastname) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.lastname,lastname,2);

    }

    @And("user enters username {string}")
    public void userEntersUsername(String username) {
        BrowserUtils.sendKeysWithTimeout( medunnaRegistrationPage.username,username,2);

    }

    @And("user enters email {string}")
    public void userEntersEmail(String email) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.email,email,2);

    }

    @And("user enters firstPassword {string}")
    public void userEntersFirstPassword(String firstpass) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.firstname,firstpass,2);
    }

    @And("user enters secondPassword {string}")
    public void userEntersSecondPassword(String secondpass) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.passwordReenter,secondpass,2);

    }



    @Then("verify the {string} validation message is displayed")
    public void verifyTheValidationMessageIsDisplayed(String expectedMessage) {
       // Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(text(), '"+message+"')]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(expectedMessage));

    }

    ////////////////////////////

    //CREATE A ROOM

    //TC_01_CREATE A ROOM WITH VALID DATA
    @Given("user enters credentials to medunna")
    public void userToMedunnaWithCredentials(io.cucumber.datatable.DataTable dataTable) {
        List<String> credantials = dataTable.row(1);
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.usernameLogin,credantials.get(0),2);
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.passwordLogin,credantials.get(1),2);
    }

    @And("user clicks on medunna login button")
    public void userClicksOnMedunnaLoginButton() {
        BrowserUtils.clickWithTimeOut(medunnaRegistrationPage.signInButton,2);
    }

    @Then("user clicks itemsButton")
    public void userClicksItemsButton() {
        BrowserUtils.clickWithTimeOut(medunnaRegistrationPage.items_TitlesButton,2);
    }

    @Then("user clicks roomButton")
    public void userClicksRoomButton() {
        BrowserUtils.clickWithTimeOut(medunnaRegistrationPage.RoomLink,2);
    }

    @And("user clicks create a new room button")
    public void userClicksCreateANewRoomButton() {
        BrowserUtils.clickWithTimeOut(medunnaRegistrationPage.createNewRoomButton,2);
    }

    @When("page opened  gives room credentials")
    public void pageOpenedGivesRoomCredentials(io.cucumber.datatable.DataTable dataTable) {
        List<String> roomArea= dataTable.row(1);
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.roomNumberField,roomArea.get(0),1);
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.roomPriceField,roomArea.get(1),1);
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.roomDescriptionField,roomArea.get(2),1);
    }

    @And("user selects deluxe room type")
    public void userSelectsDeluxeRoomType() {
        BrowserUtils.dropdownSelectByValue(medunnaRegistrationPage.roomTypeSelect,"DELUXE");
        WaitUtils.waitFor(1);
    }

    @Then("user clicks status button")
    public void userClicksStatusButton() {
        BrowserUtils.clickWithTimeOut(medunnaRegistrationPage.roomStatus,2);
    }

    @Then("user gives a {string}")
    public void userGivesA(String date) {
        BrowserUtils.sendKeysWithTimeout(medunnaRegistrationPage.roomCreatedDate,date,2);
    }

    @And("user clicks medunnaRoom save button")
    public void userClicksMedunnaRoomSaveButton() {
        BrowserUtils.clickWithTimeOut(medunnaRegistrationPage.saveButton,2);
    }

    @And("user verify room number is same;")
    public void userVerifyRoomNumberIsSame() {
        BrowserUtils.clickWithTimeOut(medunnaRegistrationPage.createdDate,2);
        Assert.assertEquals("1596",medunnaRegistrationPage.firstRoomNumber);
        WaitUtils.waitFor(3);

    }
















}
