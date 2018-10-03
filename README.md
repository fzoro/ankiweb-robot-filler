## Ankiweb robot filler

- Based on **[Kotlin](https://kotlinlang.org "Kotlin")**,**[Selenium](https://www.seleniumhq.org/ "Selenium")** and **[Cucumber](https://cucumber.io/ "Cucumber")** this project aims to avoid manual inputs in Ankiweb if you have bunch of cards ready to go;
- About Ankiweb: https://ankiweb.net/about ;


### How to use

- Must have [chrome webdriver](http://chromedriver.chromium.org/ "chrome webdriver") in your path;
- Change english_basic.feature file or create a new one in src/test/resources like the code below:
```
Feature: Fulfill my Ankiweb deck with some flashcards
  Scenario: As a user I want to ADD the following cards to a deck
    Given I am at Ankiweb home page
    And I sign in with "userId" and "password" credentials
    When I am ready to create cards
    Then I create "English Basic" deck with following cards
      | hello | olá   |
      | world | mundo |
```

### How to run

- ``./gradlew cucumber`` linux/osx
- ``gradlew.bat cucumber`` windows
