package com.meals.repository;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
	public class DatasourceConfig {
	    @Bean
	    public DataSource datasource() {
	        return DataSourceBuilder.create()
	          .driverClassName("com.mysql.jdbc.Driver")
	          .url("jdbc:oracle:thin:@localhost:1521:XE")
	          .username("system")
	          .password("password")
	          .build(); 
	    }
}
