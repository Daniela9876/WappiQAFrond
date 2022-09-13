Feature: make an order
As qa automator
I want to make a order
to validate the operation

  Background: : login correct
    Given the user is in the page wappi
    When he enters the information for the login
      | User          | Password   |
      | dgutierrezm07 | 1152466800 |

    Scenario:
      When make a order
      Then I should see in the confirmation message
