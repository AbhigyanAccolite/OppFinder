package com.oppfinder.oppfinder.RowMapper;


import com.oppfinder.oppfinder.Model.Skills;
import com.oppfinder.oppfinder.Repository.OppFinderRepository;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class JobPostSkillsRowMapper implements RowMapper<Skills>{
    private OppFinderRepository oppFinderRepository;

    public JobPostSkillsRowMapper(OppFinderRepository oppFinderRepository) {
        this.oppFinderRepository = oppFinderRepository;
    }


    public Skills mapRow(ResultSet rs, int row) throws SQLException {
        System.out.println(rs);
        Skills skill = new Skills();
        List<Skills> skillsList = oppFinderRepository.getSkillSets();


        for(int i = 0; i < skillsList.size(); i++) {
            if(rs.getInt("skillId") == skillsList.get(i).getId()) {
                skill.setId(rs.getInt("skillId"));
                skill.setName(skillsList.get(i).getName());
                break;
            }
        }
        return skill;
    }
}
