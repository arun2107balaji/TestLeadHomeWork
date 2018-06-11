Feature: CreateLead
Scenario Outline: Login(Positive)
Given Invoke the Application
And Enter the UserName as <username>
And Enter the Password as <password>
When Click Login 
Then Verify Login
And Click CRM/SFA
And Click on the CreateLead 
And Enter CompanyName as <companyName>
And Enter FirstName as <FirstName>
And Enter LastName as <LastName>
When Click CreateLeadButton
Then Verify CreateLeads
Examples:
|username|password|companyName|FirstName|LastName|
|DemoCSR|crmsfa|Accenture|Arun|Balaji|
|DemoSalesManager|crmsfa|Accenture|Arun|Balaji|


