# new feature
# Tags: optional
    
Feature: Client is able to Add Job Post
    
Scenario: Client makes request to POST /jobpost
When OppFinder asks to add a new job
Then The Server responds acceptance with 200 code