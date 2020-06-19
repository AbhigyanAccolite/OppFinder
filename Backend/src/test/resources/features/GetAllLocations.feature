# new feature
# Tags: optional
    
Feature: Client is able to retrieve all Location

Scenario: App forwards data request to GET /locations
When server gets request to GET /locations
Then App gets response code 200