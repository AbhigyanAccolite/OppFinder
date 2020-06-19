package com.oppfinder.oppfinder.Repository;

import com.oppfinder.oppfinder.Model.*;
import com.oppfinder.oppfinder.RowMapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.oppfinder.oppfinder.Repository.OppFinderSQLQueries.*;

@Repository
public class OppFinderRepository implements JobPostInterface {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public OppFinderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<JobPost> getAllJobPost() {
        return jdbcTemplate.query(GET_ALL_JOB_POST, new JobPostingRowMapper());
    }
    public boolean saveJobPost(JobPost jobPost) {
        return (1 == jdbcTemplate.update(INSERT_JOB_POST, jobPost.getId(), jobPost.getProfileId(),
                jobPost.getDescription(), jobPost.getLocationId(), jobPost.isActive(), jobPost.getOpenings(),
                jobPost.getPostedOn(), jobPost.getPostedBy(), jobPost.getLastUpdatedOn(), jobPost.getLastEditedBy(),
                jobPost.getEmploymentTypeId()));
    }

    public boolean editJobPost(JobPost jobPost) {
        return (1 == jdbcTemplate.update("UPDATE jobPosting SET profileId="+jobPost.getProfileId()+", description='"+
                        jobPost.getDescription()+"', locationId="+jobPost.getLocationId()+", isActive="+jobPost.isActive()+
                        ", openings="+jobPost.getOpenings() + ", postedOn='"+jobPost.getPostedOn()+"', postedBy='"+jobPost.getPostedBy()+
                        "', lastUpdatedOn='"+jobPost.getLastUpdatedOn()+"', lastEditedBy='"+jobPost.getLastEditedBy()+
                        "', employmentTypeId="+jobPost.getEmploymentTypeId()+" WHERE id='"+jobPost.getId()+"'"));
    }

    @Override
    public List<Skills> getJobPostSkills(String id) {
        return jdbcTemplate.query("SELECT skillId from jobPostSkillSet WHERE jobPostId='"+id+"'",
                new JobPostSkillsRowMapper(this));
    }

    @Override
    public boolean saveSkillsForJobPost(List<Skills> skills, String id) {
        try {
            StringBuilder query = new StringBuilder(INSERT_JOB_POST_SKILL_SET);
            for(int i = 0; i < skills.size(); i++) {
                if(i == skills.size() - 1) {
                    query.append(" ('"+id+"', "+skills.get(i).getId()+")");
                }
                else {
                    query.append(" ('"+id+"', "+skills.get(i).getId()+"), ");
                }
            }
            System.out.println(query);
            jdbcTemplate.update(query.toString());
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean deleteJobPost(String id) {
        return (1 == jdbcTemplate.update(DELETE_JOB_POST, id));
    }





    public List<LocationNameAndCount> getLocationTrend() {
        return jdbcTemplate.query(LOCATION_TREND,
                new LocationTrendRowMapper(this));
    }

    public List<SkillNameAndCount> getSkillTrend() {
        return jdbcTemplate.query(SKILL_TREND,
                new SkillTrendRowMapper(this));
    }

    public List<ProfileNameAndCount> getProfileTrend() {
        return jdbcTemplate.query(PROFILE_TREND,
                new ProfileTrendRowMapper(this));
    }

    public List<Location> getLocations() {
        return jdbcTemplate.query(ALL_LOCATION, new LocationRowMapper());
    }
    public List<Skills> getSkillSets() {
        return jdbcTemplate.query(ALL_SKILL_SET, new SkillsRowMapper());
    }
    public List<JobProfiles> getJobProfiles() {
        return jdbcTemplate.query(ALL_JOB_PROFILE, new JobProfileRowMapper());
    }
    public List<EmploymentType> getEmploymentTypes() {
        return jdbcTemplate.query(ALL_EMPLOYMENT_TYPE, new EmploymentTypeRowMapper());
    }




}
