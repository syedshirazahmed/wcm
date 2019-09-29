@LoadAndLogin
Feature: Navigate to Mercury Tours and Login using Data From Examples

  Scenario Outline: Load Mercury Tours Webpage and Login
    Given I load Mercury Tours Login Page
    Then I fill In Username with "<username>"
    And I fill In Password with "<password>"
    And I click the Submit Button

    Examples: 
      | username  		| password 			|
      | something123 	| something123 	|
