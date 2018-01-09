package com.sherif.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.sherif.boot", "com.sherif.controller", "com.sherif.bean"})
//@EnableConfigurationProperties(value= {ConfigBean.class})
public class Main {
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
