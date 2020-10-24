Feature: SignUp User

  Scenario: Create user by UI
    Then Open "sign-up" page
    Then Input user Email
    Then Input user First name
    Then Input user Last name
    Then Input user password
    Then Click "Start Learning" button span
    Then Content with "User account successfully created." visible

  Scenario: Create user by API
    Then Create user by API
