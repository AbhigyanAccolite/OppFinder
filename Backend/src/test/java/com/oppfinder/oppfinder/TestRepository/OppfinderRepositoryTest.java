package com.oppfinder.oppfinder.TestRepository;


import com.oppfinder.oppfinder.Mocks;
import com.oppfinder.oppfinder.Repository.OppFinderRepository;
import org.junit.Assert;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OppfinderRepositoryTest {

    OppFinderRepository oppFinderRepository = new OppFinderRepository(getJdbcTemplate());


    @Test
    @Order(1)
    public void shouldReturnAllJobPost() {
        Assert.assertTrue(oppFinderRepository.getAllJobPost().size() > 0);
    }

    @Test
    @Order(2)
    public void shouldReturnAllLocations() {
        Assert.assertTrue(oppFinderRepository.getLocations().size() > 0);
    }

    @Test
    @Order(3)
    public void shouldReturnAllSkills() {
        Assert.assertTrue(oppFinderRepository.getSkillSets().size() > 0);
    }

    @Test
    @Order(4)
    public void shouldReturnAllProfiles() {
        Assert.assertTrue(oppFinderRepository.getJobProfiles().size() > 0);
    }

    @Test
    @Order(5)
    public void shouldReturnAllEmploymentTypes() {
        Assert.assertTrue(oppFinderRepository.getEmploymentTypes().size() > 0);
    }

    @Test
    @Order(6)
    public void shouldReturnSkillsTrend() {
        Assert.assertTrue(oppFinderRepository.getSkillTrend().size() > 0);
    }

    @Test
    @Order(7)
    void shouldReturnLocationsTrend() {
        Assert.assertTrue(oppFinderRepository.getLocationTrend().size() > 0);
    }

    @Test
    @Order(8)
    void shouldReturnProfilesTrend() {
        Assert.assertTrue(oppFinderRepository.getProfileTrend().size() > 0);
    }

    @Test
    @Order(9)
    void shouldInsertJobPost() {
        Assert.assertTrue(oppFinderRepository.saveJobPost(Mocks.job));
    }

    @Test
    @Order(10)
    public void shouldInsertJobPostSkills() {
        Assert.assertTrue(oppFinderRepository.saveSkillsForJobPost(Mocks.skills, Mocks.job.getId()));
    }

    @Test
    @Order(11)
    void shouldUpdateJobPost() {
        Assert.assertTrue(oppFinderRepository.editJobPost(Mocks.job));
    }


    @Test
    @Order(12)
    void shouldDeleteJobPost() {
        Assert.assertTrue(oppFinderRepository.deleteJobPost(Mocks.job.getId()));
    }



    static JdbcTemplate getJdbcTemplate() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/oppfinder");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("123");
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return new JdbcTemplate(driverManagerDataSource);
    }
}
