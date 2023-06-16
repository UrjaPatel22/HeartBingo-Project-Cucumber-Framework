package uk.co.heartbingo.pages;

import net.bytebuddy.utility.RandomString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

import java.util.Random;

public class SignUpPage extends Utility {


    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }

    public static String generatedEmail;
    @CacheLookup
    @FindBy(xpath= "//input[@id='first_name']")
    WebElement firstNameField;


    @CacheLookup
    @FindBy(xpath="//input[@id='last_name']")
    WebElement lastNameField;


    @CacheLookup
    @FindBy(xpath="//span[@class='regpath__button-next-text']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath="//label[normalize-space()='Male']")
    WebElement genderMale;


    @CacheLookup
    @FindBy(xpath="//input[@id='regpath_form_email_input']")
    WebElement emailInputBox;


    @CacheLookup
    @FindBy(xpath="//input[@id='password']")
    WebElement passwordField;


    @CacheLookup
    @FindBy(xpath="//input[@id='phone_number']")
    WebElement mobileNumberField;

    @CacheLookup
    @FindBy(xpath="//select[@name='day']")
    WebElement day;


    @CacheLookup
    @FindBy(xpath="//select[@name='month']")
    WebElement month;

    @CacheLookup
    @FindBy(xpath="//select[@name='year']")
    WebElement year;


    @CacheLookup
    @FindBy(xpath="//input[@id='address1']")
    WebElement addressField;

    @CacheLookup
    @FindBy(xpath="//input[@id='address2']")
    WebElement townField;


    @CacheLookup
    @FindBy(xpath="//input[@id='address3']")
    WebElement cityField;

    @CacheLookup
    @FindBy(xpath="//input[@id='postcode']")
    WebElement postCodeField;


    @CacheLookup
    @FindBy(xpath="//span[@class='regpath__button-next-text']")
    WebElement continueTabField;

    @CacheLookup
    @FindBy(xpath="//label[@for='marketing_opt_in']")
    WebElement receiveCheckBox;


    @CacheLookup
    @FindBy(xpath="//label[@for='terms_privacy_policy']")
    WebElement termsAndCondition;

    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Create Account']")
    WebElement createAccount;

    @CacheLookup
    @FindBy(xpath="//span[@class='bvs-icon is-close bvs-msg-box__close is-active']")
    WebElement closeButton;

    @CacheLookup
    @FindBy(xpath="//span[@class='bvs-icon is-close bvs-msg-box__close is-active']")
    WebElement titleTextOfHeartBingoPopUp;


    public void enterFirstName(String firstName) {
        log.info("Enter first name " + firstName + " to firstName field " + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }


    public void enterLastName(String lastName) {
        log.info("Enter first name " + lastName + " to lastName field " + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void clickOnContinueButton() {
        log.info("Clicking on Continue Button" );
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", continueButton);
    }

    public void clickOnGender() {
        log.info("Clicking on Gender Male Button" );
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", genderMale);
    }


    public void fillInEmail(){
        Random randomPartOfEmailGenerator = new Random(5000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        //random string generator - to use in email
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();
        generatedEmail = "john" + randomNumberInEmail + randomStringInEmailGenerator + "john@gmail.com";
        log.info("Enter email " + emailInputBox.toString());
        sendTextToElement(emailInputBox, generatedEmail);
    }

    public void enterPassword(String password) {
        log.info("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }


    public void enterMobileNumber(String mobileNumber) throws InterruptedException {
        log.info("Enter mobile number " + mobileNumber + " to mobile number field " + mobileNumberField.toString());
        Thread.sleep(1000);
        sendTextToElement(mobileNumberField, mobileNumber);


    }

    public void selectDobFromDropDownList(){
        log.info("Select DOB from to DOB field " );
        selectByVisibleTextFromDropDown(day,"15");
        selectByVisibleTextFromDropDown(month,"September");
        selectByVisibleTextFromDropDown(year,"1996");
    }


    public void enterAddress(String address) {
        log.info("Enter first name " + address + " to address field " + addressField.toString());
        sendTextToElement(addressField, address);
    }

    public void enterTown(String town) {
        log.info("Enter town " + town + " to town field " + townField.toString());
        sendTextToElement(townField, town);
    }

    public void enterCity(String city) {
        log.info("Enter city " + city + " to city field " + cityField.toString());
        sendTextToElement(cityField, city);
    }


    public void enterPostCode(String postCode) {
        log.info("Enter city " + postCode + " to city field " + postCodeField.toString());
        sendTextToElement(postCodeField, postCode);
    }


    public void clickOnContinueTab() {
        log.info("Clicking on Continue Button" );
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", continueTabField);
    }

    public void clickOnReceiveCheckBox(){
        log.info("Clicking on I want to receive checkbox");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", receiveCheckBox);
    }

    public void clickOnTermsAndConditionCheckBox(){
        log.info("Clicking on Terms & Condition checkbox");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", termsAndCondition);
    }

    public void clickOnCreateAccountButton(){
        log.info("Clicking on Create  Account Button");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", createAccount);
    }

    public void clickOnCrossButtonInUploadDoc(){
        log.info("Clicking on Close Button");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", closeButton);
    }


    public String actualTextOfHeartBingoPopup() {
        log.info("get actual title text of HeartBingo");
       return getTextFromElement(titleTextOfHeartBingoPopUp);
    }

}
