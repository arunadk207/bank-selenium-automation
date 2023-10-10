Feature: Logout feature
  Scenario: Logout feature validation
    Given customer is on account page
    When clicks on logout button
    Then customer navigated to login page
    Then click on home button
