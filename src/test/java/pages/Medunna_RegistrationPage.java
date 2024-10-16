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

    ////////////////////////

    //CREATE A ROOM

    //TC_01_CREATE A ROOM WITH VALID DATA

    @FindBy(name = "username")
    public WebElement usernameLogin;

    @FindBy(name = "password")
    public WebElement  passwordLogin;

    @FindBy(className = "btn btn-primary")
    public WebElement signInButton;

    @FindBy(partialLinkText = "Items&Titles")
    public WebElement items_TitlesButton;

    @FindBy(partialLinkText = "Room")
    public WebElement RoomLink;

    @FindBy(partialLinkText = "Create a new Room")
    public WebElement createNewRoomButton;

    @FindBy(xpath = "(//input)[1]")
    public WebElement roomNumberField;

    @FindBy(id = "room-roomType")
    public WebElement roomTypeSelect;

    @FindBy(id = "room-status")
    public WebElement roomStatus;

    @FindBy(id = "room-price")
    public WebElement roomPriceField;

    @FindBy(id = "room-description")
    public WebElement roomDescriptionField;

    @FindBy(id = "room-createdDate")
    public WebElement roomCreatedDate;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "(//td)[2]")
    public WebElement firstRoomNumber;

    @FindBy(xpath = "//span[contains(text(), 'Created Date')]")
    public  WebElement createdDate;


    ////////////

    //TC04_CREATE A ROOM WITHOUT REQUIRED FIELDS

    @FindBy(id = "btn btn-primary")
    public WebElement singInButton;
    @FindBy(xpath = "//span[contains(text(),'Items&Titles')]")
    public WebElement ItemsTitles;
    @FindBy(xpath = "//span[contains(text(),'Room')][1]")
    public WebElement RoomButton;
    @FindBy(className = "btn btn-primary float-right jh-create-entity")
    public WebElement CreateANewRoom;
    @FindBy (id = "save-entity")
    public WebElement SaveButton;
    @FindBy (className = "invalid-feedback")
    public WebElement InvalidFeedback;


}
