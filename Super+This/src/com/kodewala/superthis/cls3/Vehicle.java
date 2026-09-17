package com.kodewala.superthis.cls3;

public class Vehicle {
	private String brand;
	private String model;
	
	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
}

class Car extends Vehicle{
	private double price;
	private String fuelType;
	
	public Car(String brand, String model, double price, String fuelType) {
		super(brand,model);
		this.price = price;
		this.fuelType = fuelType;
	}
	
	void displayDetails() {
		System.out.println(getBrand());
		System.out.println(getModel());
		System.out.println(price);
		System.out.println(fuelType);
		System.out.println();
	}
}