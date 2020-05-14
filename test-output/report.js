$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sumitsharma/MyStuff/BDD/FreeCRMBDDFramework/src/main/java/Features/contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Create Contact",
  "description": "",
  "id": "create-contact",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM create a new contact",
  "description": "",
  "id": "create-contact;free-crm-create-a-new-contact",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user navigate to contacts page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters contact details \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "create-contact;free-crm-create-a-new-contact;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 15,
      "id": "create-contact;free-crm-create-a-new-contact;;1"
    },
    {
      "cells": [
        "sumit.pb@gmail.com",
        "Fake@73873",
        "Sumit",
        "Sharma",
        "Test Analyst"
      ],
      "line": 16,
      "id": "create-contact;free-crm-create-a-new-contact;;2"
    },
    {
      "cells": [
        "williekeith425@gmail.com",
        "Fake@73873",
        "Keith",
        "Willie",
        "Associate"
      ],
      "line": 17,
      "id": "create-contact;free-crm-create-a-new-contact;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Free CRM create a new contact",
  "description": "",
  "id": "create-contact;free-crm-create-a-new-contact;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"sumit.pb@gmail.com\" and \"Fake@73873\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user navigate to contacts page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters contact details \"Sumit\" and \"Sharma\" and \"Test Analyst\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 8182140806,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 25851314,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sumit.pb@gmail.com",
      "offset": 13
    },
    {
      "val": "Fake@73873",
      "offset": 38
    }
  ],
  "location": "LoginStepDefinition.user_enters_user_name_and_password(String,String)"
});
formatter.result({
  "duration": 686260941,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 91456724,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 13669231,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_navigate_to_contacts_page()"
});
formatter.result({
  "duration": 2286793463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sumit",
      "offset": 29
    },
    {
      "val": "Sharma",
      "offset": 41
    },
    {
      "val": "Test Analyst",
      "offset": 54
    }
  ],
  "location": "LoginStepDefinition.user_enters_contact_details(String,String,String)"
});
formatter.result({
  "duration": 1867637438,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 195503463,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Free CRM create a new contact",
  "description": "",
  "id": "create-contact;free-crm-create-a-new-contact;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"williekeith425@gmail.com\" and \"Fake@73873\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user navigate to contacts page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters contact details \"Keith\" and \"Willie\" and \"Associate\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 4614659374,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 15036684,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "williekeith425@gmail.com",
      "offset": 13
    },
    {
      "val": "Fake@73873",
      "offset": 44
    }
  ],
  "location": "LoginStepDefinition.user_enters_user_name_and_password(String,String)"
});
formatter.result({
  "duration": 611789852,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 113099557,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 6215939,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_navigate_to_contacts_page()"
});
formatter.result({
  "duration": 2181927328,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Keith",
      "offset": 29
    },
    {
      "val": "Willie",
      "offset": 41
    },
    {
      "val": "Associate",
      "offset": 54
    }
  ],
  "location": "LoginStepDefinition.user_enters_contact_details(String,String,String)"
});
formatter.result({
  "duration": 1588819058,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 149271381,
  "status": "passed"
});
});