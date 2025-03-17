

Feature: Account page validation

Background: QA Luanch application
Given the qa open the google chrome
    When the qa go the URL "https://tutorialsninja.com/demo/index.php?route=account/login"
    And the qa entered email as "aouad@gmail.com" and password "Qwerty"
    And the qa click on the log in button
 
  Scenario: QA Update email and phone number
  
    When qa click the edit button 
    Then qa able to see personal detail
    When qa edit "<email>" and phone "<phone>"
    Then qa validate succes message 

    Examples: 
      | email           | phone      | 
      | aouad@gmail.com | 7752762788 |      