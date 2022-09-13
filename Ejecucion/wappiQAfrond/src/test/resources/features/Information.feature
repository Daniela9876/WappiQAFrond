Feature: update information
  As QA Automation
  I want update information
  To validate its correct operation


  Background: login correct
    Given the user is in the page wappi
    When he enters the information for the login
      | User          | Password   |
      | dgutierrezm07 | 1152466800 |

    When make a order
    Then I should see in the confirmation message

  Scenario Outline: Update information
    When he enters the information '<Name>', '<Lastname>', '<Country>', '<Fecha>', '<Genero>'
    Examples:
      | Name      | Lastname    | Country    | Fecha        | Genero |
      | "Daniela" | "Gutierrez" | "Colombia" | "07/07/1998" | "Femenino"|


