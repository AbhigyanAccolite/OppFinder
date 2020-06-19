package com.oppfinder.oppfinder.RowMapper;

import com.oppfinder.oppfinder.Model.Location;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationRowMapper implements RowMapper<Location> {
    public Location mapRow(ResultSet rs, int row) throws SQLException {

        Location location = new Location();

        location.setId(rs.getInt("id"));
        location.setName(rs.getString("name"));

        return location;
    }
}
