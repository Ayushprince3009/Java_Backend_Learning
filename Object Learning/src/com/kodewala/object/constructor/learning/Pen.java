/*Create a Pen class.
One default constructor.
One parameterized constructor.
Create one object using each constructor.*/

package com.kodewala.object.constructor.learning;

public class Pen {

	public static void main(String[] args) {
		PenDetails pen1 = new PenDetails();
		PenDetails pen2 = new PenDetails("Ball", 50);

	}

}

class PenDetails{
	private String type;
	private int price;
	
	PenDetails(){
		
	}
	
	PenDetails(String _type, int _price){
		this.type = _type;
		this.price = _price;
	}
}
