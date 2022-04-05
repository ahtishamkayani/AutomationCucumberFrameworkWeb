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
Feature: Verify creative chaos main page drop down menu

  Scenario: Validate overlay button is working
    Given Verify creative Chaos Main page
    When Click Dropdown
    And Select service option
    And Select solution option
    And Select process option
    And Select client option
    And Select work option
    And Select insights option
    And Select contact option
    Then Verify submit button functionality
    When Verifying Lets Build button visibilty
    Then user click on button
