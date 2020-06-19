package com.oppfinder.oppfinder;

import com.oppfinder.oppfinder.Model.JobPostAndSkills;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CucumberStepDefinitions extends OppfinderApplicationTests {

    private ResponseEntity<List> response;
    private ResponseEntity<Boolean> dbChangeResponse;
    static final String BASE_URL = "http://localhost:8080/apis";

    @When("client calls /jobpost")
    public void clientCallsGetJobPost() {
        response = template.getForEntity(BASE_URL + "/jobpost", List.class);
    }

    @Then("client receives response code {int}")
    public void clientReceivesJobPost(int code) {
        HttpStatus responseCode = response.getStatusCode();
        Assert.assertEquals(code, responseCode.value());
    }

    @When("Client makes request to GET /employmenttype")
    public void clientCallsGetEmploymentType() {
        response = template.getForEntity(BASE_URL + "/employmenttype", List.class);
    }

    @Then("Client receives response code {int}")
    public void clientReceivesEmploymentTypes(int code) {
        HttpStatus responseCode = response.getStatusCode();
        Assert.assertEquals(code, responseCode.value());
    }

    @When("User call request to GET /profiles")
    public void clientCallsGetProfiles() {
        response = template.getForEntity(BASE_URL + "/profiles", List.class);
    }

    @Then("User receives response code {int}")
    public void clientReceivesProfiles(int code) {
        HttpStatus responseCode = response.getStatusCode();
        Assert.assertEquals(code, responseCode.value());
    }

    @When("server gets request to GET /locations")
    public void clientCallsGetLocations() {
        response = template.getForEntity(BASE_URL + "/locations", List.class);
    }


    @Then("App gets response code {int}")
    public void clientReceivesLocations(int code) {
        HttpStatus responseCode = response.getStatusCode();
        Assert.assertEquals(code, responseCode.value());
    }

    @When("application server takes request to GET /skills")
    public void clientCallsGetSkills() {
        response = template.getForEntity(BASE_URL + "/skills", List.class);
    }

    @Then("frontend waits for {int} response code")
    public void clientReceivesSkills(int code) {
        HttpStatus responseCode = response.getStatusCode();
        Assert.assertEquals(code, responseCode.value());
    }

    @When("The App Server gets request")
    public void clientCallsForGetProfileTrend() {
        response = template.getForEntity(BASE_URL + "/profile/trends", List.class);
    }

    @Then("The requester sends response code {int}")
    public void clientReceivesProfileTrend(int code) {
        HttpStatus responseCode = response.getStatusCode();
        Assert.assertEquals(code, responseCode.value());
    }

    @When("OppFinder hits to fetch location trends")
    public void clientCallsGetLocationTrend() {
        response = template.getForEntity(BASE_URL + "/location/trends", List.class);
    }

    @Then("OppFinder fetches code {int}")
    public void clientReceivesLocationTrend(int code) {
        HttpStatus responseCode = response.getStatusCode();
        Assert.assertEquals(code, responseCode.value());
    }


    @When("The Application gets to return trends of Skill")
    public void clientCallsGetSkillTrend() {
        response = template.getForEntity(BASE_URL + "/skill/trends", List.class);
    }

    @Then("Application gets status {int} code")
    public void clientReceivesSkillTrend(int code) {
        HttpStatus responseCode = response.getStatusCode();
        Assert.assertEquals(code, responseCode.value());
    }


    @When("OppFinder asks to add a new job")
    public void clientCallsPostJobPost() {
        dbChangeResponse = template.postForEntity(BASE_URL + "/jobpost",
                new JobPostAndSkills(Mocks.job, Mocks.skills), Boolean.class);
    }

    @Then("The Server responds acceptance with {int} code")
    public void clientReceivesPostJobPost(int code) {
        HttpStatus responseCode = dbChangeResponse.getStatusCode();
        Assert.assertEquals(code, responseCode.value());
    }


    @When("When App Asks to delete job post")
    public void clientCallsDeleteJobPost() {
        template.delete(BASE_URL + "/jobpost/?id="+Mocks.job.getId());
    }

    @Then("server should return {int} code as an acknowledgement")
    public void clientReceivesDeleteJobPost(int code) {
        Assert.assertEquals(code, 200);
    }

    @When("client request to update the existing job post")
    public void clientCallsUpdateJobPost() {
        template.put(BASE_URL + "/jobpost",
                new JobPostAndSkills(Mocks.job, Mocks.skills),Boolean.class);
    }

    @Then("update job post with {int} as acknowledgement")
    public void clientReceivesUpdateJobPost(int code) {

        Assert.assertEquals(code, 200);
    }


}
