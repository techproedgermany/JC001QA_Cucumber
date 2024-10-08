@scenario_outline
Feature: search_feature

  Background:
    Given user navigates to "https://www.google.com/"

  Scenario Outline: TC_search_items
    When user search for "<search_items>"
    Then verify the result contains "<search_items>"
    And close the application

    Examples:
    │ search_items │
    │ iPhone       │
    │teapot        │
    │tesla         │
    │flower        │
    │toyota        │

# shift + \ ==> │
# Scenario Outline instead of Scenario .. to make it more dynamic
  # Examples keyword is MUST ... without this, otherwise it will complain
  # "<search_items>" => add the name of the column that has the test data
  # This test case has 1 Scenario Outline, but it will run this scenario (these test steps) 5 times because there are 5 data in the column

