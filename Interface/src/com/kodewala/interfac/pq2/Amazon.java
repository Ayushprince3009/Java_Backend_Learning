package com.kodewala.interfac.pq2;

public class Amazon implements Shopping{

	@Override
	public void searchProduct() {
		System.out.println("Search Product");
		
	}

	@Override
	public void addToCart() {
		System.out.println("Add items to cart");
		
	}

	@Override
	public void placeOrder() {
		System.out.println("Place Order");
		
	}

	@Override
	public void makePayment() {
		System.out.println("Make payment");
		
	}
	
	
	@Override
	public void productFeedback() {
		System.out.println("Give Feedback");
	}

}
