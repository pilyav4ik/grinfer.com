Feature: Login User

  Scenario: Login user
    Then Click "Log In" button
    Then Input email
    Then Input password
    Then Click "Log in" button span
    Then Content with "Logged in." visible