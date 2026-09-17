package com.kodewala.hashset.practicee.q13;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		Set<Book> book = new HashSet<Book>();
		
		//Book b1 = new Book(978101,"Java Basics", "James", 1);
		Book b1 = new Book(978101, "Java Basics", "James", 1);
		Book b2 = new Book(978101, "Java Basics 2nd", "James", 1);
		Book b3 = new Book(978101, "Java Basics", "James", 2);
		Book b4 = new Book(978202, "Spring", "Mark", 1);
		Book b5 = new Book(978202, "Spring Framework", "Mark", 1);
		Book b6 = new Book(978303, "SQL", "John", 1);
		
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		book.add(b5);
		book.add(b6);
		System.out.println(book.size());
	}
}
