package com.casestudy.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class TgtCaseStudy1Application {
	
	private final static Logger logger = LoggerFactory.getLogger(TgtCaseStudy1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(TgtCaseStudy1Application.class, args);
		logger.debug("Spring boot aplication started...");
		
		
	}
}
