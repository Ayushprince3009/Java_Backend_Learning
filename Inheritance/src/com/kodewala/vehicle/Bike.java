package com.kodewala.vehicle;

public class Bike extends Vehicle {
	private String model;
	private double price;
	
	public Bike(String company, String fuel, String model, double price) {
		super(company, fuel);
		this.model = model;
		this.price = price;
	}

//	public double getPrice() {
//		return price;
//	}
	
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
		else {
			this.price = 0.0;
		}
	}
	
	void displayDetails() {
		System.out.println("Company:- "+getCompany());
		System.out.println("Fuel:- "+getFuel());
		System.out.println("Model:- "+model);
		System.out.println("Price:- "+price);
	}
	
	
	
	
}
