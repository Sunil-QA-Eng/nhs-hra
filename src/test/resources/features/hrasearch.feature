Feature: NHS Health Research Authority search page functionality

  Background:
    Given I am on home page
    And I click on thanks button on news letter subscription
    And I click on Accept All cookies
    When I send "COVID-19 research" to search text field
    And I click on search submit button

  @regression
  Scenario: Verify search page filter by type best practice returns result
    When I tick check box for best practice
    Then I verify the "No results found."

  @regression
  Scenario: Verify search page filter by type Learning returns result
    When I tick check box for Learning
    Then I verify the "No results found."

  @regression
  Scenario: Verify search page filter by type Policies, Standards & Legislation returns result
    When I tick check box for Policies, Standards & Legislation
    Then I verify the "No results found."
