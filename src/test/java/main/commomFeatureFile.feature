@allscenarios
Feature: Alert check

	@iframe
	Scenario: windowhandler	
	
	When I navigate to "https://www.w3schools.com/html/html_iframe.asp" website
	And I navigate to a iframe containing element "//span[contains(text(),'.com')]"
#	And I click on "//h3[contains(text(),'HTML Table Example')]/parent::div/a" button
#	And I navigate back to previous window and close it
	
	@windowhandler
	Scenario: windowhandler	
	
	When I navigate to "https://www.w3schools.com/html/html_tables.asp" website
	And I navigate to a iframe containing element "//span[contains(text(),'.com')]"
	And I click on "//h3[contains(text(),'HTML Table Example')]/parent::div/a" button
	And I navigate back to previous window and close it
	
	@alert
	Scenario: Alert using Firefox
	
	When I navigate to "https://ksrtc.in/oprs-web/" website using firefox
	And I click on "//button[contains(text(),'Search for Bus')]" button
	Then I capture the text in Alert box and pass to next step
	But I preint the previous text in console window
	And I dismiss the alert