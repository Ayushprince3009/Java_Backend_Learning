package com.kodewala.encapsulation.mobilestore;
//brand *model *price *stock
public class Mobile {
	private String brand;
	private String model;
	private double price;
	private int stock;
	
	public Mobile(String brand, String model, double price, int stock) {
		this.brand = brand;
		this.model = model;
		
		if(price > 0) {
			this.price = price;
		}
		else {
			this.price = 0.0;
			System.out.println("Invalid Price");
		}
		
		if(stock > 0) {
			this.stock = stock;
		}
		else {
			this.stock = 0;
			System.out.println("Invalid Stock");
		}
	}
	
	public void purchaseMobile(int quantity) {
		if(quantity <= stock) {
			System.out.println("Thanks for purchasing");
			this.stock -= quantity;
			System.out.println("Stock left:-"+stock);
			System.out.println();
		}
		else {
			System.out.println("Item Out Of Stock");
			System.out.println();
		}
	}
	
	public void reStock(int quantity) {
		if(quantity > 0) {
			stock += quantity;
			System.out.println("Available Stock:-"+stock);
			System.out.println();
		}
		else {
			System.out.println("Invalid Quantity");
			System.out.println();
		}
	}
	
	public void displayDetails() {
		System.out.println("Brand Name:- "+brand);
		System.out.println("Model Name:- "+model);
		System.out.println("Price:- "+price);
		System.out.println("Available Stock:- "+stock);
		System.out.println();
	}
}
