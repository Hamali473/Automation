Feature: Login

  Scenario: Successful Login with Valid Credentials

    Given User is on the SauceDemo login page
    When User enter the email as "standard_user"
    And User enter the password as "secret_sauce"
    Then User click on sign-in button and user is directed to the main page
