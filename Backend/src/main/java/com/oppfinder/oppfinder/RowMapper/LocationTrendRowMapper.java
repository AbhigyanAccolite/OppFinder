package com.oppfinder.oppfinder.RowMapper;

import com.oppfinder.oppfinder.Model.Location;
import com.oppfinder.oppfinder.Model.LocationNameAndCount;
import com.oppfinder.oppfinder.Repository.OppFinderRepository;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class LocationTrendRowMapper implements RowMapper<LocationNameAndCount> {

    OppFinderRepository oppFinderRepository;

    public LocationTrendRowMapper(OppFinderRepository oppFinderRepository) {
        this.oppFinderRepository = oppFinderRepository;
    }


    public LocationNameAndCount mapRow(ResultSet rs, int row) throws SQLException {
        LocationNameAndCount count = new LocationNameAndCount();
        List<Location> locationList = oppFinderRepository.getLocations();
        for(int i = 0; i < locationList.size(); i++) {
            if(locationList.get(i).getId() == rs.getInt("locationId")) {
                count.setName(locationList.get(i).getName());
                break;
            }
        }
        count.setCount(rs.getInt("count"));
        return count;
    }
}
