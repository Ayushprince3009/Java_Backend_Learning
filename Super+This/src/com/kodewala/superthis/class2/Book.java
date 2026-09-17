package com.kodewala.superthis.class2;

public class Book {
	private String title;
	private double price;
	
	public Book() {
		this("Python");
	}
	
	public Book(String title) {
		this(title, 100.0);
	}
	
	public Book(String title, double price ) {
		this.title = title;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Title:- "+title);
		System.out.println("Price:- "+price);
	}
	
	
}
