Feature: User Register
As a new user should be able to register my account
	
Scenario: Register with valid credentials
	When User clicks on My Account dropdown menu
	Then User clicks on Register link
	And User enters First name as "Rani"
	And User enters Last name as "T"
	And User enters valid email as
	And User enters valid password as "rsder@1234"
	Then User clicks on subscribe button
	Then User clicks on privacy policy
	When User on continue button
	Then User should successfully register