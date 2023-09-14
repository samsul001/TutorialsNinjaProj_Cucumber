Feature: Registration Functionality

Scenario: User creates an account only with Mandatory fields
Given user navigates to Register Account page
When User enters below details
|firstname|Samsul 									|
|lastname |Alam											|
|email    |samsulalamfath@gmail.com |
|telephone|1234567890 							|
|password |12345										|
And User selects Yes for Newaletter
And User selects Privacy Policy
And User clicks on COntinue button
Then User account should get created successfully

Scenario: User creates an duplicate account
Given user navigates to Register Account page
When User enters below details
|firstname|Samsul 									|
|lastname |Alam											|
|email    |samsulalamfath@gmail.com |
|telephone|1234567890 							|
|password |12345										|
And User selects Yes for Newaletter
And User selects Privacy Policy
And User clicks on COntinue button
Then User should get a proper warning about duplicate mail

Scenario: User creates an account without filling any details
Given user navigates to Register Account page
When User doesnt enter any details into fields
And User clicks on COntinue button
Then User should get a proper warning message for every mandatory field