Feature: Media Resource Page



  Scenario: TC001-Localization: User able to change Language.
    
    Given user navigates to media Resource page in English
    When User clicks Deutsch language link 
    Then language should change to Deutsch
    
  
    Scenario: TC002-Verify body of Media Resource Page
    
    Given user navigates to media Resource page in English
    Then Product Screenshots link should work
    And Xeneta Logo link should work
    And Spokpersons link should work
    And Image of Founders link should work
  

    Scenario Outline: TC003-Verify user with valid email id is  able to sign up for news letter

    Given user navigates to media Resource page in English
    When User enters "<email>" to Sign up for news letter
    And User clicks submit button 
    Then successful signing up message should be displayed
    
    Examples: 
   |  email    |              
   |sum.panpatte88@tcs.com|
    
 
     Scenario Outline: TC004-Verify system throws error message when user enters non business emails like Gmail id to sign up for news letter

    Given user navigates to media Resource page in English
    When User enters "<email>" to Sign up for news letter
    And User clicks submit button 
    Then Error message to enter business email should be displayed
    
    Examples: 
   |  email    |              
   |sum.panpatte88@gmail.com|
    

   Scenario Outline: TC005-Verify system throws error message when user enters incorrect formatted email id to sign up for news letter.

    Given user navigates to media Resource page in English
    When User enters "<email>" to Sign up for news letter
    And User clicks submit button 
    Then Error message to enter proper formatted email should be displayed
    
    Examples: 
   |  email    |              
   |xtyzccgdgjh|
   
@ignore
    Scenario Outline: TC006-Verify system throws error message when user clickd sign up for news letter without entering email id field.

    Given user navigates to media Resource page in English
    When User enters "<email>" to Sign up for news letter
    And User clicks submit button 
    Then Error message to enter proper formatted email should be displayed
    
    Examples: 
   |  email    |              
   |           |
   
   

    
    
