package com.kodewala.hashset.practicee.q13;

public class Book {
	private long isbn;
	private String bookName;
	private String author;
	private int edition;
	
	public Book(long isbn, String bookName, String author, int edition) {
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
		this.edition = edition;
	}
	
	@Override
	public int hashCode() {
		return Long.hashCode(isbn) + this.edition;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book b = (Book)obj;
		return this.isbn == b.isbn && this.edition == b.edition;
	}
}
