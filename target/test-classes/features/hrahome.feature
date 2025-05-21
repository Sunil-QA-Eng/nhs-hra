Feature: NHS Health Research Authority home page functionality

  Background: User is on home page
    Given I am on home page
    And I click on thanks button on news letter subscription
    And I click on Accept All cookies

  @smoke
  Scenario: Verify homepage loads and check url with title
    Then I verify the url is "https://www.hra.nhs.uk/"
    And I verify the heading of home page "New inclusion and diversity guidance pilot"

  @smoke
  Scenario: Verify top navigation menu items are displayed correctly
    Then I should see the following menu items:
      | COVID-19 research             |
      | Planning & improving research |
      | Approvals & amendments        |
      | About us                      |

  @smoke
  Scenario: Verify hra search functionality returns correct result
    When I send "COVID-19 research" to search text field
    And I click on search submit button
    Then I am able to see "15 results for COVID-19 research"

