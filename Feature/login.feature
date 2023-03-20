#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Feature to test login

Background: Open page
Given I am on the Sauce Demo Login Page

Scenario: Successful login

When I fill the account information for account StandardUser into the User name field and the Password field
Then I am redirected to the Sauce Demo Main Page


Scenario: Failed login
When I fill the account information for account LockedOutUser into the Username field and the Password field
Then I verify the Error Message contains the text "Sorry, this user has been banned."