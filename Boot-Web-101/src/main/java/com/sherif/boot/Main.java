package com.sherif.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {
	
	@Value("${app.name}")
	String appName;

	@Autowired
	private String message;
	
	@RequestMapping("/")
	public String hello() {
		return message + " " + appName;
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
