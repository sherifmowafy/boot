package com.sherif.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sherif.bean.ConfigBean;
import com.sherif.bean.Message;

@RestController
public class HelloController {

//	@Value("${app.message}")
//	private String message;
	
	@Autowired
	private Message message;
	
	@Autowired
	private ConfigBean cb;
	
	@RequestMapping("/")
	public String message() {
		return message.getMessage();
	}
	
	@RequestMapping("/conf")
	public String confValues() {
		return cb.getDbName() + " | " + cb.getUrl();
	}
	
}
