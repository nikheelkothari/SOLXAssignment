Feature: parse json functionality

  Scenario: retrieve all key values in the below JSON
    Given user has json file
    When user parse json
    Then user retrives all keys from json
