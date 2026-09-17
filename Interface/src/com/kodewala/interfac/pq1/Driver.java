package com.kodewala.interfac.pq1;

public class Driver {
	public static void main(String[] args) {
		FoodDelivery food = new Zomato();
		System.out.println("Details for Zomato Order");
		food.placeOrder();
		food.trackOrder();
		food.makePayment();
		food.cancelOrder();
		food.rateOrder();
		System.out.println("-----------------------");
		
		FoodDelivery food1 = new Swiggy();
		System.out.println("Details for Swiggy Order");
		food1.placeOrder();
		food1.trackOrder();
		food1.makePayment();
		food1.cancelOrder();
		food1.rateOrder();
		System.out.println("-----------------------");
		
		FoodDelivery food2 = new Swish();
		System.out.println("Details for Swish Order");
		food2.placeOrder();
		food2.trackOrder();
		food2.makePayment();
		food2.cancelOrder();
		food2.rateOrder();
		System.out.println("-----------------------");
	}
}
