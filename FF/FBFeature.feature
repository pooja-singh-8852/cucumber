@tag
Feature: Login Feature
  Verify if user is able to Login in Facebook

Background: common step
Given user is  on "https://www.facebook.com/" fb homepage

@tag1
Scenario: Login with valid credentials
When user enter "6397928852" as a user name 
And  user enter "pooja@8852" as a password
Then login must be successful
 
@tag2
Scenario: Login with invalid credentials
When user enter "seema" as a user name 
And  user enter "seema@8852" as a password
 
@tag2
Scenario: Login with invalid credentials
When user enter "ankita" as a user name 
And  user enter "ankita@8852" as a password
 