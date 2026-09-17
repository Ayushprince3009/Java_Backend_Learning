package com.kodewala.encapsulation.librarymanagement;
//*bookId *bookName *author *availableCopies
public class LibraryManagement {
	private String bookId;
	private String bookName;
	private String author;
	private long availableCopies;
	
	public LibraryManagement(String bookId, String bookName, String author, long availableCopies) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		
		if(availableCopies > 0) {
			this.availableCopies = availableCopies;
		}
		else {
			this.availableCopies = 0;
		}
	}
	
	public void issueBook(int quantity) {
		if(availableCopies > quantity) {
			System.out.println();
			System.out.println("Book Issued");
			availableCopies -= quantity;
			System.out.println("Left Available Copy:- "+availableCopies);
			System.out.println();
		}
		else {
			System.out.println("Book Not Available");
		}
	}
	
	public void returnBook(int quantity) {
		System.out.println();
		System.out.println("Book Returned");
		availableCopies += quantity;
		System.out.println("Left AvailableCopies:- "+availableCopies);
		System.out.println();
	}
	
	public void displayBookDetails() {
		System.out.println("Book Id:- "+bookId);
		System.out.println("Book Name:- "+bookName);
		System.out.println("Author Name:- "+author);
		System.out.println("Available copies:- "+availableCopies);
	}
}
