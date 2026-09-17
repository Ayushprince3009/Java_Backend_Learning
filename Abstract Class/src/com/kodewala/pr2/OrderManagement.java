package com.kodewala.pr2;

public abstract class OrderManagement {
	abstract void placeOrder();
	abstract void editOrder();
	abstract void confirmOrder();
	
	void getOrderStatus() {
		System.out.println("Order Status Checked");
	}
}

