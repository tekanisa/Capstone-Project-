Feature: Sign In Feature

 @signInTest
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click On Signin  option
    And User enter email 'capstoneanisa@test.com' and password 'Love90123$'
    And User click on login button
    Then User should be logged in into Account

 @CreateAccount
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in  option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                 | password  | confirmPassword |
      | panthers | anisawali668@retail.com | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
    # Whener you wanna run or create a new account plz change the email.