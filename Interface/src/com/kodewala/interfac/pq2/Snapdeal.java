package com.kodewala.interfac.pq2;

public class Snapdeal implements Shopping {
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
}
