Feature: Fulfill my Ankiweb deck with some flashcards

  Scenario: As a user I want to ADD the following cards to a deck

    Given I am at Ankiweb home page
    And I sign in with "userId" and "password" credentials
    When I am ready to create cards
    Then I create "MyCardEnglishBasic" deck with following cards
      | hello | olá   |
      | world | mundo |


