package com.interview.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

public class Config {
	@Bean(name = "jdbcTemplate1")
	public JdbcTemplate jdbcTemplate1(@Qualifier("db1") DataSource ds) {
		return new JdbcTemplate(ds);
	}

}
