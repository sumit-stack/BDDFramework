Feature: Deal data creation

Scenario: Free CRM create a new Deal

Given User is already on login page	
When Title of login page is Free CRM
Then user enters username and password
|username|password|
|sumit.pb@gmail.com|abc123|
Then user clicks on login button
Then user is on home page
Then user navigate to deal page
Then user enters deal details
|Title|Amount|Commission|Probability|
|Test deal|500|10|50|
|Test Deal1|600|15|25|
|Test Deal2|700|20|30|
Then Close the browser 