Feature: Facebook userlogin
 Description: User provides correct credentials to login my account
 
 Background:
 
    Given I open browser
    When I navigate to the URL
 
 @F
  Scenario: Testing login functionality of the FB user login using valid credentials
  
    
    And I enter correct username and password
    And I click on login button
    Then I must login to the facebook account successfully
    And I close the browser
    
  Scenario: Testing login functionality of the FB user login using invalid credentials
  
    
    And I enter incorrect username and password
    And I click on login button again
    Then I must not login to the facebook account successfully
    And I close the browser again
     
  