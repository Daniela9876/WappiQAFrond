Feature: login
  As QA automation
  I want to start session
  to validate the entry to the wappi page


  Scenario: login correct

    Given the user is in the page wappi
    When he enters the information for the login
      | User          | Password   |
      | dgutierrezm07 | 1152466800 |
    Then the user should see the name...
