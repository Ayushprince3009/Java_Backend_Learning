/*Create a Laptop class.

Default constructor should print "Laptop Created".
Create 5 objects using a loop.*/

package com.kodewala.object.constructor.learning;

public class Laptop {

	public static void main(String[] args) {
		LaptopUse lap = new LaptopUse();

	}

}

class LaptopUse{
	
	LaptopUse(){
		for(int i =1; i<=5; i++) {
			System.out.println("Laptop created");
		}
	}
}
