package com.oppfinder.oppfinder.Model;


import java.util.List;

public interface JobPostInterface {
    boolean saveJobPost(JobPost jobPost);
    boolean editJobPost(JobPost jobPost);
    boolean deleteJobPost(String id);
    boolean saveSkillsForJobPost(List<Skills> skills, String id);

    List<JobPost> getAllJobPost();
    List<Location> getLocations();
    List<Skills> getSkillSets();
    List<JobProfiles> getJobProfiles();
    List<EmploymentType> getEmploymentTypes();
    List<LocationNameAndCount> getLocationTrend();
    List<SkillNameAndCount> getSkillTrend();
    List<ProfileNameAndCount> getProfileTrend();
    List<Skills> getJobPostSkills(String id);
}
