@regression
Feature: users could use login functionality to use their accounts



  Scenario: user could login with valid email and password


    Given User opens browser and navigate to thee the website
    And user go to login page

    When user login with "valid" "test@example.com" and "P@ssw0rd"

    Then  user press on login button
    And  user login to the system successfully