Feature: User Search
User should be able to search for different products and add the products to cart

	
Scenario Outline: Search with valid product name
	When User enters valid product name as <productname>
	And User clicks on search icon
	Then User should navigates to search page
	And User clicks on Add to cart icon
	Then User should see Product <productname> added successfully to cart
	
	 Examples:			
	| productname  | 
	| iMac	       |
	| HTC Touch HD |
	| iPhone	     | 
	
	
	