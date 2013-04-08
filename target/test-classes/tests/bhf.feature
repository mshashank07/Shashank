Feature: Testing for login page
 
Scenario: Successful login
Given I want to use the browser
	When I type testuser1 in the username input field
	When I type testuser1 in the password input field
	And I click the login button
	Then I am on the login page
