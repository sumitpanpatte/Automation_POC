Prerequisites to run:
System should have setup to support java maven project. That is
1) Java Runtime environment configured in system.
2) Install and configure Maven.
3) Google chrome and firefox should be installed in system

Instruction on how to run:
Approach 1)
1) Please download project from above source code repository.
2) Open project  folder and Click on Execute.bat file.
3) Reports are generated at /target/site/cucumber-reports/

Approach 2)
1) Import the project from source code repository into Eclipse IDE as maven project.
2) Run the TestRunner.java Class.


Key feature of Framework:
1) Use of Open source test automation tool selenium
2) Design pattern is Page Object and Pagefactory. This approch minimize impact of change in UI on automation script and easy to maintain.
3) BDD approch of test case writing using Cucumber. This reduces gap between Test automation engineer and Non technicle stackholder
4) Reusable step definitions.
5) Advance Report Generation.
6) Java + Maven based Framework.
7) Log4j to create log of execution which can be found under project folder at /log/
8) Support Cross browser testing.

Testcases:
Under TestCases foler test cases are written in plain english language using (gherkin keywwords) in .feature files.
Test cases can be execluded from test run by using @ignore test annotation.

Stepdefination:
This is the package where actual java code is written to tranlate the test case steps into automation script

Base:
This is the package containg TestBase class which is having implementation of most common method to promote code resuability. Like open and close browser, click on link, select from drop down etc

Pagelibrary:
This is the package contaning Java class which represent pages in appilication.This class contain all webelement locaters

Utility:
This package conatain helper classes.

Log: Log of test execution is created under Log folder

Test Report: Test reports are created and can be found in project folder at /target/site/cucumber-reports/


Directions for the future:
1)This automation framework can be enhanced to do automation in multiple browsers and parallel execution with help of Selenium Grid.
2)Further, this project can be enhanced by configuring with Continous integration tool Jenkins



















