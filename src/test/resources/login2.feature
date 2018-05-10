@login 
Feature: MyApp Login 

Scenario: Successful MyApp Login 
	Given I go to login page 
	When I enter valid login details 
	Then I verify the dashboard page 
	
Scenario: UnSuccessful MyApp Login 
	Given I go to login page 
	When I enter invalid login details 
	Then I verify the invalid login dashboard page