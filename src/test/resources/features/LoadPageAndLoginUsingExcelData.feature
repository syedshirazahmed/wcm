@LoadAndLogin
Feature: Navigate to Mercury Tours and Login using Data From Excel Sheet

  Scenario: Load Mercury Tours Webpage and Login
    Given I load Mercury Tours Login Page
   	Then I fill In Username from Excel Sheet
    And I fill In Password from Excel Sheet
    And I click the Submit Button