package com.oppfinder.oppfinder.Service;

import com.oppfinder.oppfinder.Dao.OppFinderDao;
import com.oppfinder.oppfinder.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OppFinderService {

    @Autowired
    private OppFinderDao oppFinderDao;

    public boolean insertJobPost(JobPostAndSkills jobPost) {
        StringBuilder id = new StringBuilder();
        id.append(jobPost.getJobPost().getLastUpdatedOn());
        id.append(jobPost.getJobPost().getLocationId());
        id.append(jobPost.getJobPost().getOpenings());
        id.append(jobPost.getJobPost().getPostedBy());
        id.append(System.currentTimeMillis());

        jobPost.getJobPost().setId(id.toString());
        return oppFinderDao.insertJobPost(jobPost);
    }

    public List<Skills> getJobPostSkills(String id) {
        return oppFinderDao.getJobPostSkills(id);
    }

    public List<ProfileNameAndCount> getProfileTrend() {
        return oppFinderDao.getProfileTrend();
    }

    public List<SkillNameAndCount> getSkillTrend() {
        return oppFinderDao.getSkillTrend();
    }

    public List<LocationNameAndCount> getLocationTrend() {
        return oppFinderDao.getLocationTrend();
    }

    public boolean updateJobPost(JobPostAndSkills post) {
        return oppFinderDao.updateJobPost(post);
    }

    public List<JobPost> getAllJobPost() {
        return oppFinderDao.getAllJobPost();

    }

    public List<Location> getAllLocations() {
        return oppFinderDao.getAllLocations();
    }

    public List<Skills> getAllSkills() {
        return oppFinderDao.getAllSkills();
    }

    public List<JobProfiles> getAllJobProfiles() {
        return oppFinderDao.getAllJobProfiles();

    }

    public boolean deleteJobPost(String id) {
        return oppFinderDao.deleteJobPost(id);
    }


    public List<EmploymentType> getEmploymentType() {
        return oppFinderDao.getEmploymentType();
    }
}
