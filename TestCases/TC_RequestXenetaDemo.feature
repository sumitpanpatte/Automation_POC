Feature: Request Demo Page

 @ignore
   Scenario Outline: TC001-Verify User able to order demo after providing all details
   
    Given user navigates to request demo page
    When user eneters "<fName>" "<lName>" "<company>" "<job>" "<email>" "<number>"
    And user selects from drop down "<IAm>" "<Shipped>" "<ResponsibleFor>"
    And user clicks on Subscribe xeneta toggle button
    And User clicks on submit
    Then successful message should be displayed
    
 Examples: 
| fName    | lName | company | job |    email              | number     | IAm               | Shipped          | ResponsibleFor            |   
|  abc     | Pan   | xyz     | IT  |   abc.dgt1@dmt.com    | 9987       | Shipper/BCO       | Less than 500    | C-Level FRANK             |   

      
  Scenario Outline: TC002-Verify system throws error message when any of the input box are not field
   
    Given user navigates to request demo page
    When user eneters "<fName>" "<lName>" "<company>" "<job>" "<email>" "<number>"
    And user selects from drop down "<IAm>" "<Shipped>" "<ResponsibleFor>"
    And user clicks on Subscribe xeneta toggle button
    And User clicks on submit
    Then Please complete all required fields message should be displayed
    
 Examples: 
| fName    | lName | company | job |    email              | number     | IAm               | Shipped          | ResponsibleFor            |   
|          |       | xyz     | IT  |   abc.dgt1@dmt.com    | 9987       | Shipper/BCO       | Less than 500    | C-Level FRANK             |   
 
  

 Scenario Outline: TC003-Verify system throws error message whem email id is incorrect format
   
    Given user navigates to request demo page
    When user eneters "<email>"
    And User clicks on submit
    Then Email must be formatted correctly message should be displayed
    And Please complete all required fields message should be displayed
    
 Examples: 
 | email    |
 |  abc     |
 
    @ignore
  Scenario: TC004-Verify links to navigate to other webpages of Xeneta are present in header
   
    Given user navigates to request demo page
    Then SHIPPERS, FREIGHT FORWARDERS, PRODUCTS, LEARN
    And BLOG, FREE TRIAL & DEMO, SIGN IN  links are present in header
   
 Scenario: TC005-Verify links to navigate to other webpages of Xeneta are present in footer
   
    Given user navigates to request demo page
    Then Data Method, Customers, Our Company, Careers
    And Press, Terms of Service links are present in footer
 
