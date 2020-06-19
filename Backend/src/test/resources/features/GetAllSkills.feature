# new feature
# Tags: optional
    
Feature: Client is able to retrieve all Skills

Scenario: Client makes request to GET /skills
When application server takes request to GET /skills
Then frontend waits for 200 response code