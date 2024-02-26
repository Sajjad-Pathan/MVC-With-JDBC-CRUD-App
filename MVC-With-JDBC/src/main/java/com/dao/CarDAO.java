package com.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pojo.Car;

public class CarDAO {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/dao/daoConfig.xml");
		JdbcTemplate jdbcTemplate=applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
		
	public int setCar(Car c) {
		String query = "insert into car(cname,cnumber,cowner) values(?,?,?)";
		int result = jdbcTemplate.update(query,c.getcName(),c.getcNumber(),c.getOwnerName());
		return result;
	}
	
	public ArrayList<Car> showCar(){
		ArrayList<Car> list=new ArrayList<Car>();
		RowMapper<Car> row=new RowMapperIml();
		String query="select * From car";
		list=(ArrayList<Car>) jdbcTemplate.query(query,row);
		return list;
	}

	public void deleteCar(String cNumber) {
		String query="delete from car where cnumber=?";
		jdbcTemplate.update(query,cNumber);
		
		
	}
}
