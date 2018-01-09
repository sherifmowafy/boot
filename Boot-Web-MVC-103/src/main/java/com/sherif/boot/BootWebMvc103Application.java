package com.sherif.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sherif.bean.Product;

@SpringBootApplication
@Controller
public class BootWebMvc103Application {
	
	
	@RequestMapping("/additem")
	public String addItem() {
		return "additem";
	}
	
	@RequestMapping("/product")
	@ResponseBody
	public Product getProduct() {
		Product p = new Product("Samsung LED Monitor", 3000d);
		return p;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootWebMvc103Application.class, args);
	}
}
