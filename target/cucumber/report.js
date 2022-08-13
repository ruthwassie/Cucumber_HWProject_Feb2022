$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BankandCash.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BankandCashLoginFeature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@BankandCashScenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on the TechFios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"\u003cuserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User  enters password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on the Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should land on dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Bank and Cash Button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User Clicks on New Account Button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User Should Land on Accounts Page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters AccountTitle as \"\u003caccountTitle\u003e\" in account page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters Description as \"\u003cdescription\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters InitialBalance as \"\u003cinitialBalance\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters AccountNumber as \"\u003caccountNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User enters ContactPerson as \"\u003ccontactPerson\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User enters PhoneNumber as \"\u003cphoneNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User enters InternetBanking url as \"\u003cInternetBankingURL\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User clicks on SubmitButton",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "accountTitle",
        "description",
        "initalBalance",
        "accountNumber",
        "contactPerson",
        "phoneNumber",
        "internetBankingUrl",
        "SubmitButton"
      ],
      "line": 27,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "saving126789",
        "new customer",
        "189076543455",
        "66778wer4566",
        "Rowda",
        "9402559053",
        "www.techfios.com",
        ""
      ],
      "line": 28,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5036882300,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@BankandCashLoginFeature"
    },
    {
      "line": 4,
      "name": "@BankandCashScenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on the TechFios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"demo@techfios.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User  enters password as \"abc123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on the Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should land on dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Bank and Cash Button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User Clicks on New Account Button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User Should Land on Accounts Page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User enters AccountTitle as \"saving126789\" in account page",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters Description as \"new customer\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters InitialBalance as \"\u003cinitialBalance\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters AccountNumber as \"66778wer4566\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User enters ContactPerson as \"Rowda\"",
  "matchedColumns": [
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User enters PhoneNumber as \"9402559053\"",
  "matchedColumns": [
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User enters InternetBanking url as \"\u003cInternetBankingURL\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User clicks on SubmitButton",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_TechFios_login_page()"
});
formatter.result({
  "duration": 1488330400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_as(String)"
});
formatter.result({
  "duration": 6789100,
  "error_message": "java.lang.NullPointerException\r\n\tat steps.LoginStepDefinition.user_enters_username_as(LoginStepDefinition.java:43)\r\n\tat ✽.When User enters username as \"demo@techfios.com\"(features/BankandCash.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 26
    }
  ],
  "location": "LoginStepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_the_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Bank_and_Cash_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_Clicks_on_New_Account_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_Should_Land_on_Accounts_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "saving126789",
      "offset": 29
    }
  ],
  "location": "LoginStepDefinition.user_enters_AccountTitle_as_in_account_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "new customer",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinition.user_enters_Description_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cinitialBalance\u003e",
      "offset": 31
    }
  ],
  "location": "LoginStepDefinition.user_enters_InitialBalance_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "66778wer4566",
      "offset": 30
    }
  ],
  "location": "LoginStepDefinition.user_enters_AccountNumber_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Rowda",
      "offset": 30
    }
  ],
  "location": "LoginStepDefinition.user_enters_ContactPerson_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "9402559053",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinition.user_enters_PhoneNumber_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cInternetBankingURL\u003e",
      "offset": 36
    }
  ],
  "location": "LoginStepDefinition.user_enters_InternetBanking_url_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_SubmitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1104578200,
  "status": "passed"
});
});