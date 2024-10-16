@create_room
Feature: create a room

  Background:
    Given user navigates to "https://www.medunna.com/login"

  Scenario: TC_01_CREATE A ROOM WITH VALID DATA
    Given user enters credentials to medunna
      |username|password|
      |techproed|Techpro123.|

    And user clicks on medunna login button
    Then user clicks itemsButton
    Then user clicks roomButton
    And user clicks create a new room button
    When page opened  gives room credentials
      |roomNumber|price|description|
      |1596      |178  |room tested|
    And user selects deluxe room type
    Then user clicks status button
    Then user gives a "20/15/2024"
    And  user clicks medunnaRoom save button
    And  user verify room number is same;





  Scenario: TC04_CREATE A ROOM WITHOUT REQUIRED FIELDS
    When user enters username and password
      |username|Password|
      |techproed|Techpro123.|
    And user clicks on Sing in button
    Then verify login in Medunna is successful
    When user clicks on Item@Titles
    And user clicks on Room
    Then user clicks on Create a new Room
    And user clicks the Save button
    Then verify "<This field is required>" message