$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('feature\faceBook.feature');
formatter.feature({
  "line": 1,
  "name": "FaceBook functionalities",
  "description": "",
  "id": "facebook-functionalities",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Login button exists",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Facebook is launched",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBook.openBrowser()"
});
formatter.result({
  "duration": 7163068336,
  "status": "passed"
});
formatter.match({
  "location": "FaceBook.goToFacebook()"
});
formatter.result({
  "duration": 12354741812,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Login button exists",
  "description": "",
  "id": "facebook-functionalities;login-button-exists",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@PresenceCheck"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Given The browser is open"
    },
    {
      "line": 10,
      "value": "#When Facebook is launched"
    }
  ],
  "line": 11,
  "name": "Login button should be enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBook.loginButton()"
});
formatter.result({
  "duration": 401399336,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Login button exists",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Facebook is launched",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBook.openBrowser()"
});
formatter.result({
  "duration": 15864003313,
  "status": "passed"
});
formatter.match({
  "location": "FaceBook.goToFacebook()"
});
formatter.result({
  "duration": 26757676690,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Forgot password functionality exists",
  "description": "",
  "id": "facebook-functionalities;forgot-password-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@PageNavigation"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#Given The browser is open"
    },
    {
      "line": 16,
      "value": "#When Facebook is launched"
    }
  ],
  "line": 17,
  "name": "Click Forgot Password",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Forgot Password Page should open",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBook.clickForgotPassword()"
});
formatter.result({
  "duration": 4827697363,
  "status": "passed"
});
formatter.match({
  "location": "FaceBook.forgotPasswordPage()"
});
formatter.result({
  "duration": 93150306,
  "status": "passed"
});
});