Feature: Check user can successfully find locations
  Scenario: Check user can find locations feature
    Given a user is on US Bank home page
    And user clicks on location link on the webpage
    Then user enters zip code in find nearby location search field
    Then user can all nearby banks from the given zip code