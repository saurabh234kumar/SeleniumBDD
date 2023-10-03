@tag
Feature: Feature to test google search functionality

  @tag1
  Scenario: Validate google search is working
    Given Browser is open
    And   user is on google search page
    When  user enter a text in searchbox
    And   hits enter
    Then  user is navigated to search results page
