Feature: User Login
Registered user should be able to access the account details

Background:
	When User clicks on My Account dropdown 
	Then User clicks on Login link
	
Scenario: Login with valid credentials
	When User enters valid email address "Divya@txcct.com"
	And User enters valid password "1234"
	And User clicks on Login button
	Then User should Login successfully
	
Scenario Outline: Login with invalid credentials
	 When User enters email address <email>
	 And User enters password <password>
	 And User clicks on Login button
	 Then User should not login successfully
	 
	 Examples:			
	| email					  | password |
	| divya@txcct.com | 123ad	   |
	| ravi@txcct.com  | 1234     |
	| valar@txcct.com | 123ec	   | 