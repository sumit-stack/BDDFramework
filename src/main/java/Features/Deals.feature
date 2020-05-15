Feature: Deal data creation

Scenario: Free CRM create a new Deal

Given User is already on login page	
When Title of login page is Free CRM
Then user enters username and password
|sumit.pb@gmail.com|Fake@73873|
Then user clicks on login button
Then user is on home page
Then user navigate to deal page
Then user enters deal details
|Test deal|500|10|50|
Then Close the browser 

#this kind of test data is only applicable for the step for which it is mentioned.