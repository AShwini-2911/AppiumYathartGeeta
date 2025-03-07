Feature: Login Functionality

  Scenario: Login with a valid mobile number
    Given The user is on the login screen
    When The user enters a valid mobile number
    And Clicks on the login button
    And user enters enter OTP
    Then user should able to see home page
