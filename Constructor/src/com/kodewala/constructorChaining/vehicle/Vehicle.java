package com.kodewala.constructorChaining.vehicle;

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
	
	public Bike(String company, String model) {
		super(company);
		this.model = model;
	}
	
	public void displayDetails() {
		System.out.println("Comapny:- "+super.getCompany());
		System.out.println("Model:- "+model);
	}
}