Feature: Create Contact

Scenario Outline: Free CRM create a new contact

Given User is already on login page	
When Title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user navigate to contacts page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser 

Examples:
|username|password|firstname|lastname|position|
|sumit.pb@gmail.com|abc123|Sumit|Sharma|Test Analyst|
|williekeith425@gmail.com|abc123|Keith|Willie|Associate|