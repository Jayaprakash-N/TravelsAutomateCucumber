Feature: Login functionality
Description: Login to the PHPTravels web site

Background: Navigate to Login Screen
Given Navigate to "https://www.phptravels.net/login" Login Screen
Then I should see Login Page

Scenario: Login with valid credentials
   When I fill in "Email" with "Test@gmail.com"
    And I fill in "Password" with "test123#"
    And I click on the Log In button
    Then I am on the "My Account" page on URL "https://www.phptravels.net/account/"
