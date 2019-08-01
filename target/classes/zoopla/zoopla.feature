@zoopla
Feature: Navven Automation labs zoopla basic tests

	Scenario: List all properties on a search page

		Given I navigate to the url "zoopla"
		When I enter text "London" in textbox "searchPlace" for "USERSTORY002-HomePage"
		And I click on "searchButton" for "USERSTORY002-HomePage"
		And I get all properties 
		And I print all prices in sorted order
		And I close the driver tabs
	
	Scenario: Open fifth property on dynamic list and verify agent
	
		Given yyy
	 