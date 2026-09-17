package com.kodewala.vehicle;

public class Vehicle {
	private String company;
	private String fuel;
	
	public Vehicle(String company, String fuel) {
		this.company = company;
		this.fuel = fuel;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getFuel() {
		return fuel;
	}
}
