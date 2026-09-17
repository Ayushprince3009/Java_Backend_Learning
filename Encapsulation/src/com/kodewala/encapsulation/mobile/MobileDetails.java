package com.kodewala.encapsulation.mobile;

public class MobileDetails {
	private String brand;
	private String model;
	private int price;
	
	public MobileDetails(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		setPrice(price);
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand =brand;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price >= 0) {
			this.price = price;
		}
		else {
			this.price = 0;
		}
	}
	
	public void displayMobileDetails() {
		System.out.println("Brand Name:- "+brand);
		System.out.println("Model Name:- "+model);
		System.out.println("Price:- "+price);
		System.out.println();
	}
}

