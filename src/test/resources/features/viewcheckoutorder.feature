Feature: User Checkout
User should be able to checkout the product

Scenario: Successfull checkout process
  When User search product name as "iMac"
  And User clicks on search link
  And User clicks on Add to cart link
	When User clicks on shopping cart link
	Then User navigates to shopping cart page
	And User clicks on checkout button
	Then User navigates to checkout page
	And User provides the valid shipping information
	And User selects on Shipping Method
	And User selects on Payment Method
	Then User clicks on confirm order
	And User should successfully placed the order