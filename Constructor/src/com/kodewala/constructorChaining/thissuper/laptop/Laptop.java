package com.kodewala.constructorChaining.thissuper.laptop;

public class Laptop {
	private String brand;
	private String processor;
	private int ram;
	private double price;
	
	public Laptop() {
		
	}
	
	public Laptop(String brand) {
		this();
		this.brand = brand;
	}
	
	public Laptop(String brand, String processor) {
		this(brand);
		this.processor = processor;
	}
	
	public Laptop(String brand, String processor, int ram) {
		this(brand,processor);
		this.ram = ram;
	}
	
	public Laptop(String brand, String processor, int ram, double price) {
		this(brand, processor, ram);
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Brand:- "+brand);
		System.out.println("Processor:- "+processor);
		System.out.println("RAM:- "+ram+" GB");
		System.out.println("Price:- "+price);
	}
}
