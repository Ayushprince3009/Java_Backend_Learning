package com.kodewala.superthis.class1;

public class Book {
	private String title;
	private double price;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book() {
		
	}
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Title:- "+title);
		System.out.println("Price:- "+price);
		System.out.println();
	}
}
