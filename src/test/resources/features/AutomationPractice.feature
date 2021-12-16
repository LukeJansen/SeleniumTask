@selenium
Feature: Test account and checkout features of AutomationPractice.com

	As a user, I want to test the account creation and login process
	As a user, I want to test the product catalog and checkout process

	Scenario: As a user, I want to create an account so that I can sign in to purchase items.
		
		Given the user navigates to home page
		
		When the user proceeds to Login page
		And the user enters "qatesting@testing.com" in the create account input
		And the user clicks create account
		And the user enters details on create account page
		And the user clicks register button
		Then the user sees My Account page
		
		When the user clicks sign out button
		And the user enters email "qatesting@testing.com"
		And the user enters password "testing"
		And the user clicks Sign In button
		Then the user sees My Account page
		
		
	Scenario: As a user, I want to search for Summer dresses, so that I can look at what dresses are in stock
		
		Given the user navigates to home page
		
		When the user hovers over "Dresses" button
		And the user clicks the "Summer Dresses" button
		Then the user sees "Summer Dresses" catalog page
	
	Scenario: As a user, I want to add items to my basket, so that I can purchase or remove them from my basket later.
	
		Given the user navigates to home page
		
		When the user hovers over "Dresses" button
		And the user clicks the "Summer Dresses" button
		And the user hovers over first product
		And the user clicks add to cart
		Then the user sees verification message "Product successfully added to your shopping cart"
	
	Scenario: As a user, I want to checkout my basket, so that I can purchase the items I want.
	
		Given the user navigates to "https://automationpractice.com"
		
		When the user hovers over "Cart" button
		And the user clicks the "Check out" button
		And the user sees Shopping cart summary page
		And the user clicks "Proceed to checkout" button
		And the user sees Addresses page
		And the user clicks "Proceed to checkout" button
		And the user sees Shipping page
		And the user agrees to the terms of service
		And the user clicks "Proceed to checkout" button
		And the user sees Payment page
		And the user clicks "Pay by check" button
		And the user sees Order Summary page
		And the user clicks "I confirm my order" button
		Then the user sees Order Confirmation page
	
	
