/*Create a Product class.

Default constructor initializes:
price = 100
Parameterized constructor accepts price.
Compare outputs.*/
package com.kodewala.object.constructor.learning;

public class Product {

	public static void main(String[] args) {
		ProductPro num = new ProductPro();
		ProductPro num1 = new ProductPro(500); 

	}

}

class ProductPro{
	private int price;
	
	
	ProductPro(){
		price = 100;
		System.out.println(price);
	}
	
	ProductPro(int _price){
		this.price = _price;
		System.out.println(price);
	}
}
