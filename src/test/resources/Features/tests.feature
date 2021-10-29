#Author: Raquel Carmona Echevarría
Feature: Check the Empleo funcionality

  Scenario Outline: Search for a job in the search box
    Given I accept the cookies
    And I navigate to Empleo
    And I text <job> in the search text box
    And I select a profile
    When I select a city
    Then the offers Jobs are displayed

    Examples: 
      | job       |
      | developer |
      | manager   |

  Scenario: Visit News page
    Given I accept the cookies
    And I navigate to News
    Then the News page is displayed
