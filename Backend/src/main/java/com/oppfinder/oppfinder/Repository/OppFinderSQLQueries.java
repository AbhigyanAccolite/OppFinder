package com.oppfinder.oppfinder.Repository;

public class OppFinderSQLQueries {
    static final String GET_ALL_JOB_POST = "SELECT * FROM jobPosting";

    static final String INSERT_JOB_POST = "INSERT INTO jobPosting(id, profileId," +
            " description, locationId, isActive, openings, postedOn," +
            "postedBy, lastUpdatedOn, lastEditedBy, employmentTypeId) values(?, ?, ?, ?," +
            "?, ?, ?, ?, ?, ?, ?)";


    static final String INSERT_JOB_POST_SKILL_SET = "INSERT INTO jobPostSkillSet(jobPostId, skillId) VALUES";
    static final String PROFILE_TREND = "SELECT profileId, COUNT(*) AS count from jobPosting group by profileId";
    static final String SKILL_TREND = "SELECT skillId, COUNT(*) AS count from jobPostSkillSet group by skillId";
    static final String LOCATION_TREND = "SELECT locationId, COUNT(*) AS count from jobPosting group by locationId";
    static final String ALL_LOCATION = "SELECT * FROM location";
    static final String ALL_SKILL_SET = "SELECT * FROM skillSet";
    static final String ALL_JOB_PROFILE = "SELECT * FROM jobProfile";
    static final String ALL_EMPLOYMENT_TYPE = "SELECT * FROM employmentType";
    static final String DELETE_JOB_POST = "DELETE FROM jobPosting WHERE id = ?";
    static final String GET_JOB_POST = "SELECT * FROM jobPosting WHERE id =";

}
