package com.kodewala.superthisinsame.cls2;

public class Vehicle {
	private String company;
	
	public Vehicle(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
}

class Bike extends Vehicle{
	private String model;
	private double price;
	
	public Bike() {
		this("Hero");
	}
	
	public Bike(String company) {
		this(company,"HF-delux");
	}
	
	public Bike(String company,String model) {
		this(company,model,56000);
	}
	
	public Bike(String company,String model, double price) {
		super(company);
		this.model = model;
		this.price = price;
	}
	
	void displayDetails() {
		System.out.println(getCompany());
		System.out.println(model);
		System.out.println(price);
		
	}
}
