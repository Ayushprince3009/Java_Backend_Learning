package com.kodewala.interfac.pq1;

public class Swiggy implements FoodDelivery{
	
	public void placeOrder() {
		System.out.println("Food ordered through Zomato");
	}
	
	
	public void cancelOrder() {
		System.out.println("Order cancelled");
	}
	
	
	public void trackOrder() {
		System.out.println("Track Order");
	}
	
	
	public void makePayment() {
		System.out.println("Make Paymemnt");
	}
	
	
	public void rateOrder() {
		System.out.println("Rate Order");
	}	
}
