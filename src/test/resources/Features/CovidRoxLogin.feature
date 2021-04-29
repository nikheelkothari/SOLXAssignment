Feature: Feature to test CovidRox login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user navigate to the login page on <device>
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to landing screen

    Examples: 
      | username | password | device 	|
      | user11   | pass11   | iOS		 	|
      | user11   | pass11   | android |
      | user11   | pass11   | web		 	|

  Scenario Outline: Check error message for invalid login credentials
    Given user navigate to the login page on <device>
    When user enters <username> and <password>
    And clicks on login button
    Then user is prompted with error message

    Examples: 
      | username | password | device 	|
      | user22   | pass22   | iOS		 	|
      | user22   | pass22   | android |
      | user22   | pass22   | web		 	|

  Scenario Outline: Check button is disabled for empty credential field
    Given user navigate to the login page on <device>
    When user enters <username> and <password>
    And clicks on login button
    Then submit button is disabled

    Examples: 
      | username | password | device 	|
      |          | pass11   | iOS		 	|
      |          | pass11   | android |
      |          | pass11   | web		 	|
      | user22   |          | iOS		 	|
      | user22   |          | android |
      | user22   |          | web		 	|