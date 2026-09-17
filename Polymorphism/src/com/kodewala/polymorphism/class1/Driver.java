package com.kodewala.polymorphism.class1;

public class Driver {
	public static void main(String[] args) {
		Delivery del = new OneDayDelivery();
		del.estimateTime("BTM", "SARJAPURA");
		
		Delivery del1 = new ExpressDelivery();
		del1.estimateTime("Bangalore", "Hydrabad");
		
		Delivery del2 = new OneDayDelivery();
		del2.estimateTime("Bangalore", "Mumbai");
	}
}
