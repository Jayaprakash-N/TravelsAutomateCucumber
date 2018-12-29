Feature: Register User
Description: Register user to the travels web site

Background: Navigate to Register Screen
Given Navigate to "https://www.phptravels.net/register" Signup Screen
Then I should see Sign Up Page

Scenario: Register with User details
Given I fill in First Name with "Test_First" 
And I fill in Last Name with "Test_Last"
And I fill in Mobile Number with "789"
And I fill in Email with "test@gmail.com"
And I fill in Password with "test123"
And I fill in Confirm Password with "test123"
When I click on the Sign Up button
Then user should be created and should be on the "My Account" page on URL "https://www.phptravels.net/account/"