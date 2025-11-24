Feature: DemoQA API Login

Scenario: Generate token for UI tests
  Given url 'https://demoqa.com/Account/v1/Login'
  And request { userName: 'testuser', password: 'Test@1234' }
  When method post
  Then status 200

  * karate.write(response, 'token.json')