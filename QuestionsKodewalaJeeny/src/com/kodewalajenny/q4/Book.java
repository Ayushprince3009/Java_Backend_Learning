package com.kodewalajenny.q4;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public Book() {
		this("Champak","Ayush");
	}
	public Book(String title,String author) {
		this(title,author,500.0);
	}
	public Book(String title,String author,double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Title:- "+title);
		System.out.println("Author:- "+author);
		System.out.println("Price:- "+price);
		System.out.println();
	}
}
