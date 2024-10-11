package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Medunna_RegistrationPage {

    public Medunna_RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "firstName")
    public WebElement firstname;

    @FindBy(id = "lastName")
    public WebElement lastname;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement password;

    @FindBy(id = "secondPassword")
    public WebElement passwordReenter;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(className = "Toastify__toast-body")
    public WebElement toastNotification;
}
