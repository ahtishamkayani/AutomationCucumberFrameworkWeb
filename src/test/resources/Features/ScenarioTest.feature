Feature: Verify creative chaos main page drop down menu

  Scenario: Validate overlay button is working
    Given Verify creative Chaos Main page
    When Click Dropdown
  Scenario: Validate service option is working
    Given Verify creative Chaos Main page
    When Click Dropdown
    And Select service option

  Scenario: Validate solution option is working
    Given Verify creative Chaos Main page
    When Select solution option

  Scenario: Validate process option is working
    Given Verify creative Chaos Main page
    When Select process option

  Scenario: Validate client option is working
    Given Verify creative Chaos Main page
    When Select client option

  Scenario: Validate work option is working
    Given Verify creative Chaos Main page
    When Select work option

  Scenario: Validate insights option is working
    Given Verify creative Chaos Main page
    When Select insights option

  Scenario: Validate contact option is working
    Given Verify creative Chaos Main page
    When Select contact option
    Then Verify submit button functionality

  Scenario: Validate button is visible
    Given Verify creative Chaos Main page
    When Verifying Lets Build button visibilty
    Then user click on button
