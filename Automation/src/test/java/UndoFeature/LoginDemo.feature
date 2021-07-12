Feature: Login Functionality

  @Smoke
  Scenario Outline: Login Functionality
    Given User navigates to Google home page
    When user enters the valid <username> and <Password>
    And Click on Login button
    Then Validate the HomePage

    Examples: 
      | username | Password |
      | Ankit    |    12345 |

  @regression
  Scenario Outline: Login Functionality
    Given User navigates to Google home page
    When user enters the valid <username> and <Password>
    And Click on Login button
    Then Validate the HomePage

    Examples: 
      | username | Password |
      | Shivam   |    12345 |
      | Ankit    |    12345 |

  @Sanity
  Scenario Outline: Login Functionality
    Given User navigates to Google home page
    When user enters the valid <username> and <Password>
    And Click on Login button
    Then Validate the HomePage

    Examples: 
      | username | Password |
      | Shivam   |    12345 |
