/*Create a Vehicle class with:

Default constructor
Constructor with one String
Constructor with one int

Create:

Vehicle v1 = new Vehicle();
Vehicle v2 = new Vehicle("Honda");
Vehicle v3 = new Vehicle(200000);

Observe which constructor runs each time.*/

package com.kodewala.object.constructor.learning;

public class Vechile {

	public static void main(String[] args) {
		VechileDetails v1 = new VechileDetails();
		VechileDetails v2 = new VechileDetails("Honda");
		VechileDetails v3 = new VechileDetails(500000);

	}

}

class VechileDetails{
	private String name;
	private int price;
	
	VechileDetails(){
		
	}
	
	VechileDetails(String _name){
		this.name = _name;
	}
	
	VechileDetails(int _price){
		this.price = _price;
	}
}
