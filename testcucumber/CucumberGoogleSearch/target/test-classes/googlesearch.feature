#Author: Krishna Kanth
#Google Search Feature Definition Template
Feature: Google search

  Scenario: Search for ducks
    Given google home page
    When search for word ducks
    Then check for the wikipedia link
    Then click First link from the search
