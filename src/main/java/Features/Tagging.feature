Feature: Free CRM Application

@SmokeTest
Scenario: Login to CRM Application
Given user login to CRM application

@RegressionTest
Scenario: user navigate to contacts
Given user navigate to contacts

@FunctionalTest
Scenario: user navigate to deals
Given user navigate to deals

@SmokeTest @RegressionTest
Scenario: user home page
Given user navigate to home page

@FunctionalTest
Scenario: user navigate to companies
Given user navigate to companies

