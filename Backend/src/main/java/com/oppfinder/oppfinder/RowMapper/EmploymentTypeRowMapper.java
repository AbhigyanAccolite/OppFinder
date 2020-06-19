package com.oppfinder.oppfinder.RowMapper;

import com.oppfinder.oppfinder.Model.EmploymentType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmploymentTypeRowMapper implements RowMapper<EmploymentType> {

    public EmploymentType mapRow(ResultSet rs, int row) throws SQLException{
        EmploymentType employmentType = new EmploymentType();

        employmentType.setId(rs.getInt("id"));
        employmentType.setName(rs.getString("name"));

        return employmentType;
    }
}
