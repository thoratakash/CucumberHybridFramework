# all annotation is common for all scenarios present in Search feature file
@all
Feature: Search functionality

@search @validproduct @smoke @regression
Scenario: Search for a valid product
Given User open the application
When User enter valid product "HP" into search field
And User click on Search button
Then Valid Product should get displayed in search results

@search @nonexistingproduct @regression
Scenario: Search for a non-existing product
Given User open the application
When User enter non-existing product "Honda"  into search field
And User click on Search button
Then Proper text informing the User about no product matching should be displayed


@search @noproduct @regression
Scenario: Search without providing any product
Given User open the application
When User dont enter any product into search field
And User click on Search button
Then Proper text informing the User about no product matching should be displayed

