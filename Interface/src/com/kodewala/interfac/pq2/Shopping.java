package com.kodewala.interfac.pq2;

public interface Shopping {
	public abstract void searchProduct();
	abstract void addToCart();
	void placeOrder();
	void makePayment();
	
	//default method optional for subclass
	public default void productFeedback() {
		System.out.println("give feedback");
	}
}
