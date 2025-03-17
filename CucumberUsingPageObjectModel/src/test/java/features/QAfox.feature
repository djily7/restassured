Feature: QA FOX LOG IN PAGE

  Scenario: qa fox log in with valid credentials
    Given the qa open the google chrome
    When the qa go the URL "https://tutorialsninja.com/demo/index.php?route=account/login"
    And the qa entered email as "dj-aouad@live.com" and password "Qwerty"
    And the qa click on the log in button
    Then the qa validate that my account is displayed
    
  
