package uk.co.heartbingo.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.heartbingo.pages.HomePage;
import uk.co.heartbingo.pages.SignUpPage;

public class SignUpSteps {
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
    }




    @When("^I click on SignUp link$")
    public void iClickOnSignUpLink()  {
        new HomePage().acceptCookies();
        new HomePage().clickOnSignUpLinkOnPage();
        }

    @And("^I enter \"([^\"]*)\" in firstname field$")
    public void iEnterInFirstnameField(String firstName)  {
        new SignUpPage().enterFirstName(firstName);
    }

    @And("^I enter \"([^\"]*)\" in lastname field$")
    public void iEnterInLastnameField(String lastName)  {
        new SignUpPage().enterLastName(lastName);

    }

    @And("^I Clicking On Continue Button$")
    public void iClickingOnContinueButton() {
        new SignUpPage().clickOnContinueButton();

    }

    @And("^I Click ON Gender Male Button$")
    public void iClickONGenderMaleButton() {
        new SignUpPage().clickOnGender();
    }

    @And("^I enter \"([^\"]*)\" into email Field$")
    public void iEnterIntoEmailField(String arg0)  {
      new SignUpPage().fillInEmail();
    }

    @And("^I enter \"([^\"]*)\" into password field$")
    public void iEnterIntoPasswordField(String password)  {
new SignUpPage().enterPassword(password);
    }

//    @And("^I enter (\\d+) in Mobile Number Field$")
//    public void iEnterInMobileNumberField(int mobile) {
//
//        new SignUpPage().enterMobileNumber(mobile);
//    }

    @And("^I enter Date Of Birth in DOB field$")
    public void iEnterDateOfBirthInDOBField() {
        new SignUpPage().selectDobFromDropDownList();
    }

    @And("^I enter \"([^\"]*)\" in address field$")
    public void iEnterInAddressField(String add)  {
new SignUpPage().enterAddress(add);
    }

    @And("^I enter \"([^\"]*)\" in Town Field$")
    public void iEnterInTownField(String townadd)  {
new SignUpPage().enterTown(townadd);
    }

    @And("^I enter \"([^\"]*)\" in city field$")
    public void iEnterInCityField(String cityadd) {
        new SignUpPage().enterCity(cityadd);
    }

    @And("^I enter \"([^\"]*)\" in PostCode Field$")
    public void iEnterInPostCodeField(String post)  {
new SignUpPage().enterPostCode(post);
    }

    @And("^I click on continue tab on page$")
    public void iClickOnContinueTabOnPage() {
new SignUpPage().clickOnContinueTab();
    }

    @And("^I enter \"([^\"]*)\" in Mobile Number Field$")
    public void iEnterInMobileNumberField(String mobile) throws InterruptedException {
        new SignUpPage().enterMobileNumber(mobile);
    }

    @And("^I click On Marketing Communication Checkbox$")
    public void iClickOnMarketingCommunicationCheckbox() {
        new SignUpPage().clickOnReceiveCheckBox();
    }

    @And("^I click On Terms And Condition CheckBox$")
    public void iClickOnTermsAndConditionCheckBox() {
        new SignUpPage().clickOnTermsAndConditionCheckBox();
    }

    @And("^I Click on Create Account Button$")
    public void iClickOnCreateAccountButton() {
        new SignUpPage().clickOnCreateAccountButton();
    }

    @And("^I click On Cross Button in Upload Doc Popup$")
    public void iClickOnCrossButtonInUploadDocPopup() {
        new SignUpPage().clickOnCrossButtonInUploadDoc();
    }

    @Then("^Verify Message Welcome to Heart Bingo, John on Popup$")
    public void verifyMessageWelcomeToHeartBingoJohnOnPopup() {
        //Assert.assertEquals(new SignUpPage().actualTextOfHeartBingoPopup(), "Welcome to Heart Bingo, John", "Title of Message not matched");
    }
}

