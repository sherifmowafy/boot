package com.sherif.bean;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Command Line Runner [Application Started]");
		System.out.println(Arrays.toString(arg0));
		

	}

}
