package com.oppfinder.oppfinder.RowMapper;

import com.oppfinder.oppfinder.Model.JobProfiles;
import com.oppfinder.oppfinder.Model.ProfileNameAndCount;
import com.oppfinder.oppfinder.Repository.OppFinderRepository;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProfileTrendRowMapper implements RowMapper<ProfileNameAndCount>{

    private OppFinderRepository oppFinderRepository;

    public ProfileTrendRowMapper(OppFinderRepository oppFinderRepository) {
        this.oppFinderRepository = oppFinderRepository;
    }

    public ProfileNameAndCount mapRow(ResultSet rs, int row) throws SQLException {
        ProfileNameAndCount count = new ProfileNameAndCount();
        List<JobProfiles> jobProfilesList= oppFinderRepository.getJobProfiles();
        for(int i = 0; i < jobProfilesList.size(); i++) {
            if(jobProfilesList.get(i).getId() == rs.getInt("profileId")) {
                count.setName(jobProfilesList.get(i).getName());
                break;
            }
        }
        count.setCount(rs.getInt("count"));
        return count;
    }
}
