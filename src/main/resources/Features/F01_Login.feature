## login english file
Feature: Login Function Tests
  Scenario: user can login with valid credentials
    Given user opens website URL
    When user enters valid username
    And user enters valid password
    And user clicks login button
    Then user can login successfully

  Scenario: user cannot login eith invalid username
    Given user opens website URL
    When user enters invalid username
    And user enters valid password
    And user clicks login button
    Then user cannot login successfully