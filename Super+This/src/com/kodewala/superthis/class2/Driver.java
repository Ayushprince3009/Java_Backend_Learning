package com.kodewala.superthis.class2;

public class Driver {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Java");
		Book book3 = new Book("Js", 500);
		
		book1.displayDetails();
		book2.displayDetails();
		book3.displayDetails();
	}
}
