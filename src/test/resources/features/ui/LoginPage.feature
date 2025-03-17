Feature: Validate login functionality of Amazon website

  @Regression @Login
  Scenario: Validate user is on login page
    Given User on the Amazon website Login page
    When User enters the username "shubhamshubhi777@gamil.com"
    And User enters the password "Welcome@123"
    And User click on login button
    Then Validates user is on homepage "My Account"