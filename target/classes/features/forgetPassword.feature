Feature: test case to verify forget password feature
  Scenario: valid scenario
    Given User opens browser and navigate website
    And user click on forget password
    When user enters valid email
    And user press on Retrieve password
    Then password Retrieve successfully