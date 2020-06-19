# new feature
# Tags: optional
    
Feature: Client is able to retrieve all Location Trends

Scenario: OppFinder  GET /location/trends Request to fetch location trends
When OppFinder hits to fetch location trends
Then OppFinder fetches code 200