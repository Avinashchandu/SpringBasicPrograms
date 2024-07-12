package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.project")
public class BankConfig {
	
	@Bean
	public JdbcTemplate jdbcTemplateBean(DriverManagerDataSource dataSource)
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
	
	@Bean
	public DriverManagerDataSource driverManagerDataBeanSourceBean()
	{
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/chandu");
		dataSource.setUsername("root");
		dataSource.setPassword("12345");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
		
	}

}

