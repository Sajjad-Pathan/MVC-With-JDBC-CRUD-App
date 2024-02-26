package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.pojo.Car;

public class RowMapperIml implements RowMapper<Car> {

	@Override
	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
			Car c =new Car();
			c.setcName(rs.getString(1));
			c.setcNumber(rs.getString(2));
			c.setOwnerName(rs.getString(3));
		return c;
	}
	

}
