package com.sherif.bean;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("Application Runner [Application Started]");
		arg0.getOptionNames().iterator().next();
	}

}
