package com.kodewala.constructorChaining.thissuper.book;

public class Book {
	private String title;
	private double price;
	
	public Book() {
		
	}
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(String title, double price) {
		this.title= title;
		this.price = price;
	}
	
	public void displaydetails() {
		System.out.println("Title:- "+title);
		System.out.println("Price:- "+price );
		System.out.println();
	}
}
