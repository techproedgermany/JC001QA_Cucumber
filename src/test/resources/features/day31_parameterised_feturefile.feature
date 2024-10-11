@param_feature
Feature: search_feature

  Background:
    Given user navigates to "https://www.google.com/"

  @iPhone
  Scenario: TC_01_iPhone_search
    And user search for "iPhone"
    Then verify the result contains "iPhone"
    And close the application

  @teapot @flower
  Scenario: TC_02_teapot_search
    And user search for "teapot"
    Then verify the result contains "teapot"
    And close the application

  @flower
  Scenario: TC_03_flower_search
    And user search for "flower"
    Then verify the result contains "flower"
    And close the application

  @bmw
  Scenario: TC_04_bmw_search
    And user search for "bmw"
    Then verify the result contains "bmw"
    And close the application
