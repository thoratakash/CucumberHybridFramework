
# all annotation is common for all scenarios present in Register feature file
@all
Feature: User Registration

Background: 
Given User navigates to Register Account page

@register @mandatory @smoke @regression
Scenario:  User creates an account only with mandatory fields
When User enters details into below fields
|firstName          |Akash|
|lastName           |Thorat|
|telephone          |1234567890|
|password            |12345|
And User selects Privacy Policy field
And User clicks on Continue button
Then User account should get created successfully 


@register @allfields @smoke @regression
Scenario: User creates an account with all fields
When User enters details into below fields
|firstName          |Akash|
|lastName           |Thorat|
|telephone          |1234567890|
|password            |12345|
And User selects Yes for Newsletter
And User selects Privacy Policy field
And User clicks on Continue button
Then User account should get created successfully 

@register @duplicatemail @regression
Scenario: User creates a duplicate account 
When User enters details into below fields
|firstName          |Akash|
|lastName           |Thorat|
|email                   |amotoori24122022@gmail.com|
|telephone          |1234567890|
|password            |12345|
And User enters email address "thorata89@gmail.com" into the Email field field
And User selects Yes for Newsletter
And User selects Privacy Policy field
And User clicks on Continue button
Then Warning message informing the User about duplicate email should be displayed

@register @nodetails @regression
Scenario: User creates an account without filling any details 
Given User navigates to Register Account page
When User dont enter details into any fields
And User clicks on Continue button
Then Warning messages should be displayed for the mandatory fields





