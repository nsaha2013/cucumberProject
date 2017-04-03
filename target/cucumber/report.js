$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Signin.feature");
formatter.feature({
  "line": 1,
  "name": "Signin",
  "description": "",
  "id": "signin",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12494756325,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "signin successfully with correct credentials",
  "description": "",
  "id": "signin;signin-successfully-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to signin page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter username as \"identityref01mailinator.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter password as \"Password123\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be displayed with accounts dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninStep.opensigninpage()"
});
formatter.result({
  "duration": 93670375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "identityref01mailinator.com",
      "offset": 21
    }
  ],
  "location": "SigninStep.enterusername(String)"
});
formatter.result({
  "duration": 249693038,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password123",
      "offset": 21
    }
  ],
  "location": "SigninStep.enterpassword(String)"
});
formatter.result({
  "duration": 200929842,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});