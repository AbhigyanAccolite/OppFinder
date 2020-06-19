package com.oppfinder.oppfinder.TestDao;

import com.oppfinder.oppfinder.Dao.OppFinderDao;
import com.oppfinder.oppfinder.Mocks;
import com.oppfinder.oppfinder.Model.JobPostAndSkills;
import com.oppfinder.oppfinder.Repository.OppFinderRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import static com.oppfinder.oppfinder.Mocks.*;
import static com.oppfinder.oppfinder.Mocks.job;
import static com.oppfinder.oppfinder.Mocks.skills;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OppfinderDaoTest {
    
    @InjectMocks
    private OppFinderDao oppfinderDao;
    

    @Mock
    private OppFinderRepository oppFinderRepository;

    @Test
    public void shouldReturnJobPosts() {
        when(oppFinderRepository.getAllJobPost()).thenReturn(jobPosts);
        Assert.assertEquals(jobPosts, oppfinderDao.getAllJobPost());
    }

    @Test
    public void shouldReturnJobPostSkills() {
        when(oppFinderRepository.getJobPostSkills("aas111")).thenReturn(skills);
        Assert.assertEquals(skills,oppfinderDao.getJobPostSkills("aas111"));
    }

    @Test
    public void shouldReturnAllLocations() {
        when(oppFinderRepository.getLocations()).thenReturn(locations);
        Assert.assertEquals(locations,oppFinderRepository.getLocations());
    }

    @Test
    public void shouldReturnAllSkills() {
        when(oppFinderRepository.getSkillSets()).thenReturn(Mocks.skills);
        Assert.assertEquals(Mocks.skills, oppfinderDao.getAllSkills());
    }

    @Test
    public void shouldReturnAllProfiles() {
        when(oppFinderRepository.getJobProfiles()).thenReturn(jobProfilesList);
        Assert.assertEquals(jobProfilesList, oppfinderDao.getAllJobProfiles());
    }

    @Test
    public void shouldReturnAllEmploymentTypes() {
        when(oppFinderRepository.getEmploymentTypes()).thenReturn(employmentTypes);
        Assert.assertEquals(employmentTypes, oppfinderDao.getEmploymentType());
    }

    @Test
    public void shouldReturnLocationTrend() {
        when(oppFinderRepository.getLocationTrend()).thenReturn(locationTrends);
        Assert.assertEquals(locationTrends, oppfinderDao.getLocationTrend());
    }

    @Test
    public void shouldReturnSkillsTrend() {
        when(oppFinderRepository.getSkillTrend()).thenReturn(skillTrends);
        Assert.assertEquals(skillTrends, oppfinderDao.getSkillTrend());
    }

    @Test
    public void shouldReturnProfileTrend() {
        when(oppFinderRepository.getProfileTrend()).thenReturn(profileTrends);
        Assert.assertEquals(profileTrends, oppfinderDao.getProfileTrend());
    }

    @Test
    public void shouldDeleteJobPost() {
        when(oppFinderRepository.deleteJobPost("aas111")).thenReturn(true);
        Assert.assertEquals(true, oppfinderDao.deleteJobPost("aas111"));
    }

    @Test
    public void shouldUpdateJobPost() {
        JobPostAndSkills jobPostAndSkills = new JobPostAndSkills(job, skills);
        when(oppFinderRepository.editJobPost(job)).thenReturn(true);
        Assert.assertEquals(true,  oppfinderDao.updateJobPost(jobPostAndSkills));

    }

    @Test
    public void shouldAddJobPost() {
        JobPostAndSkills jobPostAndSkills = new JobPostAndSkills(job, skills);
        when(oppFinderRepository.saveJobPost(jobPostAndSkills.getJobPost())).thenReturn(true);
        when(oppFinderRepository.saveSkillsForJobPost(jobPostAndSkills.getSkills(), "aas111")).thenReturn(true);
        Assert.assertTrue(oppfinderDao.insertJobPost(jobPostAndSkills));
    }


}
