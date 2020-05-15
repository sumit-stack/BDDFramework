$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sumitsharma/MyStuff/BDD/FreeCRMBDDFramework/src/main/java/Features/DealsMap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM create a new Deal",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal",
  "type": "scenario",
  "keyword": "Scenario"
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
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "sumit.pb@gmail.com",
        "Fake@73873"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user navigate to deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "Title",
        "Amount",
        "Commission",
        "Probability"
      ],
      "line": 14
    },
    {
      "cells": [
        "Test deal",
        "500",
        "10",
        "50"
      ],
      "line": 15
    },
    {
      "cells": [
        "Test Deal1",
        "600",
        "15",
        "25"
      ],
      "line": 16
    },
    {
      "cells": [
        "Test Deal2",
        "700",
        "20",
        "30"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 7971836016,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 18456326,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_enters_user_name_and_password(DataTable)"
});
formatter.result({
  "duration": 523360738,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 5228803977,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 12251559,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_navigate_to_deal_page()"
});
formatter.result({
  "duration": 11511234303,
  "status": "passed"
});
formatter.match({
  "location": "DealStepWithMapDefinition.user_enters_deal_details(DataTable)"
});
