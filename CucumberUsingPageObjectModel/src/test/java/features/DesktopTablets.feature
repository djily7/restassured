
Feature: Counting links on the Tablets & Desktop pages

Background: QA Luanch application
Given the qa open the google chrome
    When the qa go the URL "https://tutorialsninja.com/demo/index.php?route=account/login"
    And the qa entered email as "aouad@gmail.com" and password "Qwerty"
    And the qa click on the log in button
    And qa click the edit button 
    Then qa able to see personal detail
    When qa edit "aouad@gmail.com" and phone "7752762788"
    Then qa validate succes message 
    
Scenario: QA Update email and phone number
    Examples: 
      | email           | phone      | 
      | daouad@gmail.com | 7752762788 | 
 
  Scenario: Access the links
    Given qa click on tablets 
    When qa click on desktop
    Then count how many links
  


