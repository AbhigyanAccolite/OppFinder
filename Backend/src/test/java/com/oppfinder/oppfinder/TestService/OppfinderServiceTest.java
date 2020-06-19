package com.oppfinder.oppfinder.TestService;

import com.oppfinder.oppfinder.Dao.OppFinderDao;
import com.oppfinder.oppfinder.Mocks;
import com.oppfinder.oppfinder.Model.JobPostAndSkills;
import com.oppfinder.oppfinder.Service.OppFinderService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.oppfinder.oppfinder.Mocks.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OppfinderServiceTest {

    @InjectMocks
    private OppFinderService oppFinderService;

    @Mock
    private OppFinderDao oppFinderDao;

    @Test
    public void shouldReturnJobPosts() {
        when(oppFinderDao.getAllJobPost()).thenReturn(jobPosts);
        Assert.assertEquals(jobPosts, oppFinderService.getAllJobPost());
    }

    @Test
    public void shouldReturnJobPostSkills() {
        when(oppFinderDao.getJobPostSkills("aas111")).thenReturn(skills);
        Assert.assertEquals(skills, oppFinderService.getJobPostSkills("aas111"));
    }

    @Test
    public void shouldReturnAllLocations() {
        when(oppFinderDao.getAllLocations()).thenReturn(locations);
        Assert.assertEquals(locations, oppFinderService.getAllLocations());
    }

    @Test
    public void shouldReturnAllSkills() {
        when(oppFinderDao.getAllSkills()).thenReturn(Mocks.skills);
        Assert.assertEquals(skills, oppFinderService.getAllSkills());
    }

    @Test
    public void shouldReturnAllProfiles() {
        when(oppFinderDao.getAllJobProfiles()).thenReturn(jobProfilesList);
        Assert.assertEquals(jobProfilesList, oppFinderService.getAllJobProfiles());
    }

    @Test
    public void shouldReturnAllEmploymentTypes() {
        when(oppFinderDao.getEmploymentType()).thenReturn(employmentTypes);
        Assert.assertEquals(employmentTypes, oppFinderService.getEmploymentType());
    }

    @Test
    public void shouldReturnLocationTrend() {
        when(oppFinderDao.getLocationTrend()).thenReturn(locationTrends);
        Assert.assertEquals(locationTrends, oppFinderService.getLocationTrend());
    }

    @Test
    public void shouldReturnSkillsTrend() {
        when(oppFinderDao.getSkillTrend()).thenReturn(skillTrends);
        Assert.assertEquals(skillTrends, oppFinderService.getSkillTrend());
    }

    @Test
    public void shouldReturnProfileTrend() {
        when(oppFinderDao.getProfileTrend()).thenReturn(profileTrends);
        Assert.assertEquals(profileTrends, oppFinderService.getProfileTrend());
    }

    @Test
    public void shouldDeleteJobPost() {
        when(oppFinderDao.deleteJobPost("aas111")).thenReturn(true);
        Assert.assertEquals(true, oppFinderService.deleteJobPost("aas111"));
    }

    @Test
    public void shouldUpdateJobPost() {
        JobPostAndSkills jobPostAndSkills = new JobPostAndSkills(job, skills);
        when(oppFinderDao.updateJobPost(jobPostAndSkills)).thenReturn(true);
        Assert.assertEquals(true,  oppFinderService.updateJobPost(jobPostAndSkills));
    }

    @Test
    public void shouldAddJobPost() {
        JobPostAndSkills jobPostAndSkills = new JobPostAndSkills(job, skills);
        when(oppFinderDao.insertJobPost(jobPostAndSkills)).thenReturn(true);
        Assert.assertEquals(true, oppFinderService.insertJobPost(jobPostAndSkills));
    }

}
