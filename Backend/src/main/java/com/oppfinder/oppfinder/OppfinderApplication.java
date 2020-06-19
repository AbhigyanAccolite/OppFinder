package com.oppfinder.oppfinder;

import com.oppfinder.oppfinder.Controller.OppFinderController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication(scanBasePackages={
		"com.oppfinder.oppfinder.Controller", "com.oppfinder.oppfinder.Dao", "com.oppfinder.oppfinder.Model", "com.oppfinder.oppfinder.Service",
		"com.oppfinder.oppfinder.RowMapper", "com.oppfinder.oppfinder.Repository", "com.oppfinder.oppfinder"})
@EnableAutoConfiguration()
@ComponentScan
@ComponentScan(basePackageClasses = OppFinderController.class)


public class OppfinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OppfinderApplication.class, args);
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
