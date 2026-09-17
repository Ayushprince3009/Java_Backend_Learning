package com.kodewalajenny.q5;

public class Bike extends Vehicle{
	private String engineCC;
	private double mileage;
	
	Bike(String company, String model, String engineCC, double mileage){
		super(company, model);
		this.engineCC = engineCC;
		this.mileage = mileage;
	}

	public String getEngineCC() {
		return engineCC;
	}

	public double getMileage() {
		return mileage;
	}
	
	void showBike() {
		showVehicle();
		System.out.println("Engine: "+getEngineCC());
		System.out.println("Mileage: "+getMileage());
	}
}
