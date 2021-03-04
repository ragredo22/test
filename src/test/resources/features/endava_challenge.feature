Feature: Purchase a book on amazon.com
  I want to purchase a book of testing on amazon.com


  Scenario Outline: Purchase a book
    Given I visit the page amazon

    When I'm looking for a book
      | <name> |
    Then I see two interesting books
      | <nameBooks> |

    Examples:
      | name | nameBooks                                      |
      |      | A practitioner's Guide to Software Test Desing |
      |      | Paperback tab was not shown pre-selected       |