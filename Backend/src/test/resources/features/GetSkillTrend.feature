# new feature
# Tags: optional
    
Feature: Client is able to retrieve all Skill Trends

Scenario: Client makes request to GET /skill/trends
When The Application gets to return trends of Skill
Then Application gets status 200 code