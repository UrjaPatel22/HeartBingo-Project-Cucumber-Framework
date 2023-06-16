Feature: SignUp Test
  As a user navigation to SignUp Page

  @sanity @regression
  Scenario: User successfully sign up to successfully
    Given I am on the homepage
    When  I click on SignUp link
    And   I enter "John" in firstname field
    And   I enter "Smith" in lastname field
    And   I Clicking On Continue Button
    And   I Click ON Gender Male Button
    And   I enter "random email" into email Field
    And   I enter "Password12345" into password field
    And   I enter "7852658932" in Mobile Number Field
    And   I enter Date Of Birth in DOB field
    And   I enter "45,Alendale Road" in address field
    And   I enter "sudbury" in Town Field
    And   I enter "London" in city field
    And   I enter "sw9 2PW" in PostCode Field
    And   I click on continue tab on page
    And   I click On Marketing Communication Checkbox
    And   I click On Terms And Condition CheckBox
    And   I Click on Create Account Button
    And   I click On Cross Button in Upload Doc Popup
    Then  Verify Message Welcome to Heart Bingo, John on Popup



