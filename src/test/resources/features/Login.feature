Feature: login functionality

Scenario: login with valid credential
Given User has navigated to login page
When User enter valid email address "testuser2915@gmail.com" into the email text field
And User enter valid password "test1234567890" into the password field
And User clicks on login button
Then User should get successfully logged in

Scenario: login with invalid credential
Given User has navigated to login page
When User enter invalid email address "te22st1@gmail.com" into the email text field
And User enter invalid password "123452ww" into the password field
And User clicks on login button
Then User should get a warning message about credential mismatch

Scenario: login with valid email and invalid password
Given User has navigated to login page
When User enter valid email address "testuser2915@gmail.com" into the email text field
And User enter invalid password "123452ww" into the password field
And User clicks on login button
Then User should get a warning message about credential mismatch

Scenario: login with invalid email and valid password
Given User has navigated to login page
When User enter invalid email address "test1qwe@gmail.com" into the email text field
And User enter valid password "test1234567890" into the password field
And User clicks on login button
Then User should get a warning message about credential mismatch

Scenario: login without providing any credential
Given User has navigated to login page
When User doesnt enter email address into the email text field
And User doesnt enter password into the password field
And User clicks on login button
Then User should get a warning message about credential mismatch