package com.oppfinder.oppfinder.Dao;

import com.oppfinder.oppfinder.Model.*;
import com.oppfinder.oppfinder.Repository.OppFinderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OppFinderDao {

    @Autowired
    private OppFinderRepository oppFinderRepository;


    public boolean insertJobPost(JobPostAndSkills jobPost) {
        boolean resultJobPost = oppFinderRepository.saveJobPost(jobPost.getJobPost());
        boolean resultSkillSet = oppFinderRepository.saveSkillsForJobPost(jobPost.getSkills(),
                jobPost.getJobPost().getId());

        return (resultJobPost && resultSkillSet);
    }

    public List<Skills> getJobPostSkills(String id) {
        return oppFinderRepository.getJobPostSkills(id);
    }

    public List<LocationNameAndCount> getLocationTrend() {
        return oppFinderRepository.getLocationTrend();
    }

    public List<ProfileNameAndCount> getProfileTrend() {
        return oppFinderRepository.getProfileTrend();
    }

    public List<SkillNameAndCount> getSkillTrend() {
        return oppFinderRepository.getSkillTrend();
    }

    public List<JobPost> getAllJobPost() {
        return oppFinderRepository.getAllJobPost();
    }

    public List<Location> getAllLocations() {
        return oppFinderRepository.getLocations();
    }

    public List<Skills> getAllSkills() {
        return oppFinderRepository.getSkillSets();
    }

    public List<JobProfiles> getAllJobProfiles() {
        return oppFinderRepository.getJobProfiles();
    }

    public boolean updateJobPost(JobPostAndSkills post) {
        return oppFinderRepository.editJobPost(post.getJobPost());
    }

    public boolean deleteJobPost(String id) {
        return oppFinderRepository.deleteJobPost(id);
    }

    public List<EmploymentType> getEmploymentType() {
        return oppFinderRepository.getEmploymentTypes();
    }

}
