Feature: Free CRM Login Feature

#without Example keyword
#Scenario: Free CRM login test scenario
#Given User is already on login page	
#When Title of login page is Free CRM
#Then user enters "sumit.pb@gmail.com" and "Fake@73873"
#Then user clicks on login button
#And user is on home page

#with Example Keyword and Scenario Outline

Scenario Outline: Free CRM login test scenario
Given User is already on login page	
When Title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser

Examples:
 |username|password|
 |sumit.pb@gmail.com|Fake@73873|
 |williekeith425@gmail.com|Fake@73873|
