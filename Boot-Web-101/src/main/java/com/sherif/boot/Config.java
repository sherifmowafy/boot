package com.sherif.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public String message() {
		return "Hello World";
	}
	
}
