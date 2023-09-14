Feature: Search Functionality

Sceanrio: User search for a valid product
Given User opens the application
When user enters valid product "HP" into Search box field
And User clicks on Search button
Then user should get valid product displayed in Search results

Sceanrio: User searches for an invalid product
Given User opens the application
When user enters valid product "Honda" into Search box field
And User clicks on Search button
Then user should get a message about no product matching

Sceanrio: User searches without any product
Given User opens the application
When user doesnt enter any product name into Search box field
And User clicks on Search button
Then user should get a message about no product matching