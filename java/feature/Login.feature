Feature: Login to the leaftaps applications
Scenario Outline: Postive Create Lead 
Given Launch the Chrome Browser
And Load the URL and Maximize
When Enter the Username as <UserName>
And Enter the Password as <Password>
And Click on the Login button
And Click on the Crmsfa
And Click on Leads
And Click on Create Lead
And Enter the Company Name
And Enter the First Name
And Enter the Last Name
When Click on Create Lead button

Examples:
|UserName|Password|
#|Demosalesmanager|crmsfa|
|DemoCSR|crmsfa|

#Scenario: Neative Create Lead 
#Given Launch the Chrome Browser
#Given Load URL and Maximize
#And Enter the Username
#And Enter the Password
#When Click on the Login button
#Then Verify the homepage is displayed
#But Error message is displayed
