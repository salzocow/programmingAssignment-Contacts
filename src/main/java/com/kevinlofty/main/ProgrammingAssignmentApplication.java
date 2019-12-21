package com.kevinlofty.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 *
 * @Author Kevin Lofty
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ProgrammingAssignmentApplication
{

	/**
	 * Starting point for this Spring Boot MVC Application
	 * @param args - optional array of program arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProgrammingAssignmentApplication.class, args);
	}

}
