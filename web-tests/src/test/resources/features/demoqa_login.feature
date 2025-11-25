Feature: DemoQA Login

  Scenario: Successful login using API token
    Given the browser is open
    And the user is already authenticated via API
    When the user opens the profile page
    Then the user should see the profile page