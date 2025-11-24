Feature: DemoQA Login

  Scenario: Successful login in DemoQA Book Store
    Given the user is on the DemoQA login page
    When the user enters valid credentials
    And clicks the login button
    Then the user should see the profile page