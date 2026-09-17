package com.kodewala.superthis.mobile;

public class Mobile {
	private String brand;
	private String model;
	private double price;
	
	public Mobile() {
		this("Samsung");
	}
	
	public Mobile(String brand) {
		this(brand, "S24");
	}
	
	public Mobile(String brand, String model) {
		this(brand,model,45000);
	}
	
	public Mobile(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void displayDetails() {
		System.out.println("Brand:- "+brand);
		System.out.println("Model:- "+model);
		System.out.println("Price:- "+price);
		System.out.println();
	}
}
