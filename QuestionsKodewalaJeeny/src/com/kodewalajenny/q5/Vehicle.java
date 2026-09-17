package com.kodewalajenny.q5;

public class Vehicle {
	private String company;
	private String model;

	Vehicle(String company, String model){
		this.company= company;
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}	
	
	void showVehicle() {
		System.out.println("Company: "+getCompany());
		System.out.println("Model: "+getModel());
	}
	
}
