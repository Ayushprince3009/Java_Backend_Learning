package com.kodewala.constructorChaining.last;

public class Vehicle {
	private String company;
	
	public Vehicle(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
}

class Car extends Vehicle{
	private String model;
	private double price;
	
	public Car() {
		this("Hero","Honda");
	}
	
	public Car(String company, String model) {
		this(company, model,9856789);
	}
	
	public Car(String company, String model, double price) {
		super(company);
		this.model = model;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
}

