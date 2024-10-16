package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTable_HomePage {

    public DataTable_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);}  //constructor

    @FindBy (xpath = "//span[text()='New']" )
    public WebElement newButton;

    @FindBy (id = "DTE_Field_first_name")
    public WebElement firstName;

    @FindBy (id = "DTE_Field_last_name")
    public WebElement lastName;

    @FindBy (id = "DTE_Field_position")
    public WebElement position;

    @FindBy (id = "DTE_Field_office")
    public WebElement office;

    @FindBy (id = "DTE_Field_extn")
    public WebElement extension;

    @FindBy (id = "DTE_Field_start_date")
    public WebElement startDate;

    @FindBy (id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy (xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "(//tr/td)[2]")
    public WebElement verifyNameField;
}
