Feature: Login Feature

Scenario Outline: Login fail-possible combinations


    Given User is already on Login Page
    When Title of loginpage is Admin area demo
    Then User enters <Username> in username field
    And User enters <Password> in password field
    And User clicks on login button
    Then User gets login faild error message
   

    Examples: 
      |Username               |Password   |
      |Ifraz                  | Ifz123    |   
      |ginichowdhury@gmail.com| efg5767!  |
      |parisa                |Parisa2307!| 
