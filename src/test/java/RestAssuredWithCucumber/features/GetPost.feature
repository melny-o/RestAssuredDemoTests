Feature: Get operations using Rest-assured

  Scenario: 1.1 Get
    Given Client calls USA
    Then The language name is English

   Scenario: 1.2 Verify filter parameters work correctly
     Given Client calls USA
     When Client specifies fields to be displayed: capital and currencies