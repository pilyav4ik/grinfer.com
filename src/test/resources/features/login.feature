Feature: Login User

  Scenario: Login user
    Then Click "Log In" button
    Then Input email
    Then Input password
    Then Click "Log in" button span
    Then Content with "Logged in." visible

    Then Click "Maximus" div span
    Then Click "Settings" button li
    Then Check First Name
    Then Check Last Name