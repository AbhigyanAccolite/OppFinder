# new feature
# Tags: optional
    
Feature: Client is able to delete job post
    
Scenario: Client makes request to DELETE /jobpost
When When App Asks to delete job post
Then server should return 200 code as an acknowledgement