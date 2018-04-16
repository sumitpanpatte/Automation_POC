Instruction on how to run:
1) Please import project in IDE such eclipse or Intelji
2) Run the class Runner.java under pckg driver. this should start test execution
3) Once exicution is completed , result can be found under target > cucumber-html-report > index.html.
4) Open the report in any of the web browser.
5) All the execution logs can be found under log folder
6) All test cases which are automated as part of this exercise are present under Feature folder in Registratio.feature file

Apart from what i covered, Below are  additional test cases which should be part of regression test suit for better test coverage:
1) Verify existing user id or emaild should not be allowd.
2) Verification of Error message on all fields.
3) Verification of tooltip informative message on all fields.
4) Verify Currency drop down default value is in sync with Country drop down default value.
example: if country is sweden then currency shoulg get changed to Swedish krone.
5) Verify Currency selected from drop and the currency attached with amount input box should be same. 
example: if currency changed to Swedish krone the currency attached with amount input box should be same
6) Verify contents in terms and condition page







