package com.sherif.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.sherif.bean.ConfigBean;
import com.sherif.bean.Message;

@Configuration
@EnableConfigurationProperties(value= {ConfigBean.class})
@PropertySource(value= {"classpath:config.properties"})
public class Config {

	@Bean
	public String hello() {
		return "hello";
	}
	
	@Bean
	@Profile("dev")
	public Message message() {
		Message m = new Message();
		m.setMessage("Hi I'm Dev Profile Bean");
		return m;
	}
	
	@Bean
	@Profile("prod")
	public Message productionMessage(@Value("${message}")String message) {
		Message m = new Message();
		m.setMessage(message);
		return m;
	}
	
}
