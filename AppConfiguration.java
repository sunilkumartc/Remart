package com.redmart.webapp;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.redmart.apputils.JdbcDao;
import com.redmart.apputils.ValidateOrders;
import com.redmart.orders.PlaceOrderWrapper;

@Configuration
@EnableWebMvc
@PropertySource("file:${user.home}/properties/sql.properties")
@ComponentScan(basePackages = { "com.redmart","com.redmart.webapp" })
public class AppConfiguration  extends WebMvcConfigurerAdapter{
	
	@Resource
	private Environment environment;
	
	@Bean
	public PlaceOrderWrapper placeOrderWrapper(){
		return new PlaceOrderWrapper();
	}
	
	@Bean
	public AbstractDataSource dataSource(){
		
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/redmart","ugam_dp","hFgYur7B3");
	
	}
	@Bean
	public JdbcDao jdbcDao(){
		return new JdbcDao();
	}
	@Bean
	public ValidateOrders  validateOrders(){
		
		return new ValidateOrders();
	}
	
}
