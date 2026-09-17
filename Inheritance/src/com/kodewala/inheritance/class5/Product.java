package com.kodewala.inheritance.class5;

public class Product {
	private String productName;
	private double price;
	
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double price() {
		return price;
	}
	
	void display() {
		System.out.println("Product Name:- "+productName);
		System.out.println("Price:- "+price);
	}
	
}
class Laptop extends Product{
	private String processor;
	private int ram;
	
	public Laptop(String productName, double price, String processor, int ram) {
		super(productName,price);
		this.processor = processor;
		this.ram = ram;
	}
	
	void showConfiguration() {
		display();
		System.out.println("Processor:- "+processor);
		System.out.println("RAM:- "+ram+" GB");
		System.out.println();
	}
}
