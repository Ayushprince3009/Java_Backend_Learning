/*Create a Car class.
Default constructor should print:
Brand: Not Assigned
Price: 0
Create two objects.*/
package com.kodewala.object.constructor.learning;

public class Car {

	public static void main(String[] args) {
		CarDetails car1 = new CarDetails();
		CarDetails car2 = new CarDetails("TATA", 900000);
	}

}

class CarDetails{
	private String brand;
	private int price;
	
	CarDetails(){
		brand = "Not Assigned";
		price = 0;
		System.out.println(brand);
		System.out.println(price);
	}
	
	CarDetails(String _brand, int _price){
		this.brand = _brand;
		this.price = _price;
		System.out.println(brand);
		System.out.println(price);
	}
}
