package com.kodewala.constructorChaining.thissuper.mobile;

public class Mobile {
	private String brand;
	private String model;
	private double price;
	
	public Mobile() {
		
	}
	
	public Mobile(String brand) {
		this();
		this.brand = brand;
	}
	
	public Mobile(String brand, String model) {
		this(brand);
		this.model = model;
	}
	
	public Mobile(String brand, String model, double price) {
		this(brand, model);
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Brand:- "+brand);
		System.out.println("Model:- "+model);
		System.out.println("Price:- "+price);
		System.out.println();
	}
}
