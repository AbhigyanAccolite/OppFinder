package com.oppfinder.oppfinder.RowMapper;

import com.oppfinder.oppfinder.Model.Skills;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SkillsRowMapper implements RowMapper<Skills> {

    public Skills mapRow(ResultSet rs, int row) throws SQLException{
        Skills skills = new Skills();

        skills.setId(rs.getInt("id"));
        skills.setName(rs.getString("name"));

        return skills;
    }
}
