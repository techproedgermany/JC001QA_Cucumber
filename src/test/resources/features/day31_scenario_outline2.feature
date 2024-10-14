@scenario_outline2 @smoke
Feature: data_tables_feature

  Background:
    Given user navigates to "https://editor.datatables.net/"

  Scenario Outline: TC_user_creation
    And user clicks on New button
    And user enters first name as "<first_name>"
    And user enters last name as "<last_name>"
    And user enters position as "<position>"
    And user enters office as "<office>"
    And user enters extension as "<extension>"
    And user enters start date as "<start_date>"
    And user enters salary as "<salary>"
    And user clicks on Create button
    Then verify that the name field contains "<first_name>"
    And close the application

    Examples:
      | first_name | last_name | position | office    | extension | start_date | salary |
      | Isa        | Ar        | QA       | Frankfurt | 541       | 2024-01-23 | 40000  |
      | Zakir      | Arslan    | QA       | Berlin    | 123       | 2024-01-25 | 44000  |
      | Anisa      | Omeri     | QA       | Koln      | 589       | 2024-01-28 | 100000 |
      | Smitha     | Frid      | QA       | Koblenz   | 598       | 2025-01-01 | 45000  |