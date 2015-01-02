package com.redmart.apputils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.AbstractDataSource;


public class JdbcDao {
	
	@Autowired
	AbstractDataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	   
	public JdbcTemplate getJdbcTemplateConnection(){
		   
		jdbcTemplate = new JdbcTemplate();
		
		jdbcTemplate.setDataSource(dataSource);
		
		return jdbcTemplate;

	}
	
	
}
