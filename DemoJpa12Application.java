package com.fatou.demoJpa12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.demoJpa12.dao.PersonJdbcDao;

@SpringBootApplication
public class DemoJpa12Application implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao niang;

	public static void main(String[] args) {
		SpringApplication.run(DemoJpa12Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", niang.findAll());
		// TODO Auto-generated method stub
		
	}

}
