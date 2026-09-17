package com.kodewalajenny.q8;

public class Customer {
	private String customerName;
	private double cartAmount;
	
	Customer(String customerName, double cartAmount){
		this.customerName = customerName;
		this.cartAmount = cartAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getCartAmount() {
		return cartAmount;
	}

	public void setCartAmount(double cartAmount) {
		this.cartAmount = cartAmount;
	}
	
	
}
