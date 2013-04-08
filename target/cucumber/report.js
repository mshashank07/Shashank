$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027tests\\bhf.feature\u0027");
formatter.feature({
  "id": "testing-for-login-page",
  "description": "",
  "name": "Testing for login page",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "testing-for-login-page;successful-login",
  "description": "",
  "name": "Successful login",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I want to use the browser",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I type testuser1 in the username input field",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I type testuser1 in the password input field",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I click the login button",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "I am on the login page",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "location": "StepDefinitions.I_want_to_use_the_browser()"
});
formatter.result({
  "duration": 1379877890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "StepDefinitions.I_type_testuser_in_the_username_input_field(String)"
});
formatter.result({
  "duration": 125931947605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "StepDefinitions.I_type_testuser_in_the_password_inputfield(String)"
});
formatter.result({
  "duration": 41158135978,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_click_the_login_button()"
});
formatter.result({
  "duration": 1448704963,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.I_am_on_the_login_page(String)"
});
formatter.result({
  "duration": 807745921,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Login or register]\u003e but was:\u003c[My Account]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:125)\r\n\tat org.junit.Assert.assertEquals(Assert.java:147)\r\n\tat tests.StepDefinitions.I_am_on_the_login_page(StepDefinitions.java:67)\r\n\tat ✽.Then I am on the login page(tests\\bhf.feature:8)\r\n"
});
});