Feature: Application Login
  
  In order to perform successfull Login
  As a user
  I want to enter correct username and password

  Scenario Outline: In order to verify Login to facebook
    Given User navigates to facebook website
    When user validates the homepage title
    Then User entered the "<username>" username
    And User entered the "<password>" password
    Then User "<loginType>" successfully Logged in

    Examples: 
      | username | password | loginType   |
      | valid    | valid    | shouldbe    |
      | invalid  | invalid  | shouldnotbe |
      | test 1   | test2    | test3       |
