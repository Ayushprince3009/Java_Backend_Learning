package com.kodewala.encapsulation.librarymanagement;

public class Driver {
	public static void main(String[] args) {
		//*bookId *bookName *author *availableCopies
		LibraryManagement store1 = new LibraryManagement("TEL123", "Life", "Ayush", 45);
		store1.displayBookDetails();
		
		store1.issueBook(12);
		store1.returnBook(2);
		
	}
}
