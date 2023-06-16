$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signup.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp Test",
  "description": "As a user navigation to SignUp Page",
  "id": "signup-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3630974600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User successfully sign up to successfully",
  "description": "",
  "id": "signup-test;user-successfully-sign-up-to-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on SignUp link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter \"John\" in firstname field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"Smith\" in lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Clicking On Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Click ON Gender Male Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter \"random email\" into email Field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter \"Password12345\" into password field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter \"7852658932\" in Mobile Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter Date Of Birth in DOB field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter \"45,Alendale Road\" in address field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter \"sudbury\" in Town Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter \"London\" in city field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter \"sw9 2PW\" in PostCode Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on continue tab on page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click On Marketing Communication Checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click On Terms And Condition CheckBox",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I Click on Create Account Button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click On Cross Button in Upload Doc Popup",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify Message Welcome to Heart Bingo, John on Popup",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 92856900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickOnSignUpLink()"
});
formatter.result({
  "duration": 216921700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterInFirstnameField(String)"
});
formatter.result({
  "duration": 460102400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Smith",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterInLastnameField(String)"
});
formatter.result({
  "duration": 437926100,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickingOnContinueButton()"
});
formatter.result({
  "duration": 178818700,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickONGenderMaleButton()"
});
formatter.result({
  "duration": 127205200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "random email",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterIntoEmailField(String)"
});
formatter.result({
  "duration": 408490800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password12345",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterIntoPasswordField(String)"
});
formatter.result({
  "duration": 190536500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7852658932",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterInMobileNumberField(String)"
});
formatter.result({
  "duration": 1212633100,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iEnterDateOfBirthInDOBField()"
});
formatter.result({
  "duration": 428592300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "45,Alendale Road",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterInAddressField(String)"
});
formatter.result({
  "duration": 193723600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sudbury",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterInTownField(String)"
});
formatter.result({
  "duration": 163018000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterInCityField(String)"
});
formatter.result({
  "duration": 141613400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sw9 2PW",
      "offset": 9
    }
  ],
  "location": "SignUpSteps.iEnterInPostCodeField(String)"
});
formatter.result({
  "duration": 169238000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickOnContinueTabOnPage()"
});
formatter.result({
  "duration": 89811400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickOnMarketingCommunicationCheckbox()"
});
formatter.result({
  "duration": 160261600,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickOnTermsAndConditionCheckBox()"
});
formatter.result({
  "duration": 80635500,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickOnCreateAccountButton()"
});
formatter.result({
  "duration": 75822300,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.iClickOnCrossButtonInUploadDocPopup()"
});
formatter.result({
  "duration": 5439249500,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.verifyMessageWelcomeToHeartBingoJohnOnPopup()"
});
formatter.result({
  "duration": 25500,
  "status": "passed"
});
formatter.after({
  "duration": 163800,
  "status": "passed"
});
});