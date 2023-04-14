@regression
Feature: users could register with new accounts


  Scenario: guest user could register with valid data successfully

    Given User opens browser and navigate to the website
    And user go to register page
    When  user select gender type
    And user enter first name "automation" and last name "tester"
    And user enter date of birth
    And user enter email "test@example.com" field
    And user fills Password fields
    And user clicks on register button

    Then success message is displayed



