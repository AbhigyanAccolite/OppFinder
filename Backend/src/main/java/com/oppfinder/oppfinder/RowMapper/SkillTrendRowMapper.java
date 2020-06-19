package com.oppfinder.oppfinder.RowMapper;

import com.oppfinder.oppfinder.Model.SkillNameAndCount;
import com.oppfinder.oppfinder.Model.Skills;
import com.oppfinder.oppfinder.Repository.OppFinderRepository;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class SkillTrendRowMapper implements RowMapper<SkillNameAndCount> {
    private OppFinderRepository oppFinderRepository;
    public SkillTrendRowMapper(OppFinderRepository oppFinderRepository) {
        this.oppFinderRepository = oppFinderRepository;
    }


    public SkillNameAndCount mapRow(ResultSet rs, int row) throws SQLException {
        SkillNameAndCount count = new SkillNameAndCount();
        List<Skills> skillSetsList = oppFinderRepository.getSkillSets();
        for(int i = 0; i < skillSetsList.size(); i++) {
            if(skillSetsList.get(i).getId() == rs.getInt("skillId")) {
                count.setName(skillSetsList.get(i).getName());
                break;
            }
        }
        count.setCount(rs.getInt("count"));
        return count;
    }
}
