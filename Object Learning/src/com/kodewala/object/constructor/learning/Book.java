/*Create a Book class.

Default constructor should print the memory address using this.
Create three objects.
Observe whether every object has a different address.*/

package com.kodewala.object.constructor.learning;

public class Book {

	public static void main(String[] args) {
		BookDetails book1 = new BookDetails();
		BookDetails book2 = new BookDetails();
		BookDetails book3 = new BookDetails();

	}

}

class BookDetails{
	BookDetails(){
		System.out.println(this);
	}
}

