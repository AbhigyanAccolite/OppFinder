package com.oppfinder.oppfinder.RowMapper;

import com.oppfinder.oppfinder.Model.JobProfiles;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JobProfileRowMapper implements RowMapper<JobProfiles> {
    public JobProfiles mapRow(ResultSet rs, int row) throws SQLException{
        JobProfiles jobProfiles = new JobProfiles();

        jobProfiles.setId(rs.getInt("id"));
        jobProfiles.setName(rs.getString("name"));

        return jobProfiles;
    }
}
