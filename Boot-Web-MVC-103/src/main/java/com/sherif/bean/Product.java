package com.sherif.bean;

public class Product {
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Product() {}
	
	private String name;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
