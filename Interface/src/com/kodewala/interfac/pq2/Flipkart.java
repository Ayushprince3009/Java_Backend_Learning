package com.kodewala.interfac.pq2;

public class Flipkart implements Shopping {

	@Override
	public void searchProduct() {
		System.out.println("Search Product");
		
	}

	@Override
	public void addToCart() {
		System.out.println("Add ite ms to cart");
		
	}

	@Override
	public void placeOrder() {
		System.out.println("Place Order");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Make payment");
		
	}
	
	
	//default method optional for subclass
	@Override
	public void productFeedback() {
		System.out.println("Give Feedback");
	}
	
}
