package com.oppfinder.oppfinder.RowMapper;

import com.oppfinder.oppfinder.Model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JobPostingRowMapper implements RowMapper<JobPost> {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public JobPost mapRow(ResultSet rs, int row) throws SQLException{
        JobPost jobPost = new JobPost();
        jobPost.setId(rs.getString("id"));
        jobPost.setProfileId(rs.getInt("profileId"));
        jobPost.setDescription(rs.getString("description"));
        jobPost.setLocationId(rs.getInt("locationId"));
        jobPost.setActive(rs.getBoolean("isActive"));
        jobPost.setOpenings(rs.getInt("openings"));
        jobPost.setPostedOn(rs.getString("postedOn"));
        jobPost.setPostedBy(rs.getString("postedBy"));
        jobPost.setLastUpdatedOn(rs.getString("lastUpdatedOn"));
        jobPost.setLastEditedBy(rs.getString("lastEditedBy"));
        jobPost.setEmploymentTypeId(rs.getInt("employmentTypeId"));

        return jobPost;
    }
}
