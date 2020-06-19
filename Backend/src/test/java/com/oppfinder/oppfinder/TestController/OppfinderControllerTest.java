package com.oppfinder.oppfinder.TestController;


import com.oppfinder.oppfinder.Controller.OppFinderController;
import com.oppfinder.oppfinder.Model.*;
import com.oppfinder.oppfinder.Service.OppFinderService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.oppfinder.oppfinder.Mocks.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OppfinderControllerTest {



    @InjectMocks
    private OppFinderController oppFinderController;

    @Mock
    private OppFinderService oppFinderService;

    @Test
    public void shouldReturnJobPosts() {
        when(oppFinderService.getAllJobPost()).thenReturn(jobPosts);
        Assert.assertEquals(jobPosts, oppFinderController.getAllJobPost());
    }

    @Test
    public void shouldReturnJobPostSkills() {
        when(oppFinderService.getJobPostSkills("aas111")).thenReturn(skills);
        Assert.assertEquals(skills, oppFinderController.getJobPostSkills("aas111"));
    }

    @Test
    public void shouldReturnAllLocations() {
        when(oppFinderService.getAllLocations()).thenReturn(locations);
        Assert.assertEquals(locations, oppFinderController.getAllLocation());
    }

    @Test
    public void shouldReturnAllSkills() {
        when(oppFinderService.getAllSkills()).thenReturn(skills);
        Assert.assertEquals(skills, oppFinderController.getAllSkills());
    }

    @Test
    public void shouldReturnAllProfiles() {
        when(oppFinderService.getAllJobProfiles()).thenReturn(jobProfilesList);
        Assert.assertEquals(jobProfilesList, oppFinderController.getAllJobProfiles());
    }

    @Test
    public void shouldReturnAllEmploymentTypes() {
        when(oppFinderService.getEmploymentType()).thenReturn(employmentTypes);
        Assert.assertEquals(employmentTypes, oppFinderController.getEmploymentType());
    }

    @Test
    public void shouldReturnLocationTrend() {
        when(oppFinderService.getLocationTrend()).thenReturn(locationTrends);
        Assert.assertEquals(locationTrends, oppFinderController.getLocationTrend());
    }

    @Test
    public void shouldReturnSkillsTrend() {
        when(oppFinderService.getSkillTrend()).thenReturn(skillTrends);
        Assert.assertEquals(skillTrends, oppFinderController.getSkillTrend());
    }

    @Test
    public void shouldReturnProfileTrend() {
        when(oppFinderService.getProfileTrend()).thenReturn(profileTrends);
        Assert.assertEquals(profileTrends, oppFinderController.getProfileTrend());
    }

    @Test
    public void shouldDeleteJobPost() {
        when(oppFinderService.deleteJobPost("aas111")).thenReturn(true);
        Assert.assertEquals(true, oppFinderController.deleteJobPost("aas111"));
    }

    @Test
    public void shouldUpdateJobPost() {
        JobPostAndSkills jobPostAndSkills = new JobPostAndSkills(job, skills);
        when(oppFinderService.updateJobPost(jobPostAndSkills)).thenReturn(true);
        Assert.assertEquals(true,  oppFinderController.editJobPost(jobPostAndSkills));
    }

    @Test
    public void shouldAddJobPost() {
        JobPostAndSkills jobPostAndSkills = new JobPostAndSkills(job, skills);
        when(oppFinderService.insertJobPost(jobPostAndSkills)).thenReturn(true);
        Assert.assertEquals(true, oppFinderController.addJobPost(jobPostAndSkills));
    }

}
