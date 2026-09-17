package com.kodewala.superthis.laptp;

public class Laptop {
	private String brand;
	private String processor;
	private int ram;
	private double price;
	
	public Laptop() {
		this("Hp");
	}
	
	public Laptop(String brand) {
		this(brand, "Ryzen");
	}
	
	public Laptop(String brand, String processor) {
		this(brand, processor,8);
	}
	public Laptop(String brand, String processor, int ram) {
		this(brand,processor,ram,45000);
	}
	
	public Laptop(String brand, String processor, int ram, double price) {
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.price = price;
	}
	
	
	void displayDetails() {
		System.out.println(brand);
		System.out.println(processor);
		System.out.println(ram);
		System.out.println(price);

	}
}
