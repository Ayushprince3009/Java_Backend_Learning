package com.kodewala.inheritance.vehicle;

public class Vehicle {
	private String brand;
	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	public void start() {
		System.out.println("Brand:- "+brand);
	}
	
	public void started() {
		System.out.println("Vehicle Started");
	}
}

class Car extends Vehicle{
	private String model;
	
	public Car(String brand, String model) {
		super(brand);
		this.model = model;
	}
	
	void display() {
		start();
		System.out.println("Model:- "+model);
		started();
	}
}
