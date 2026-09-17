package com.kodewalajenny.q8;

public class PrimeCustomer extends Customer {
	private double discountPercent = 10;
	private int deliveryCharge = 80;
	
	PrimeCustomer(String customerName, double cartAmount){
		super(customerName, cartAmount);
	
		
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public int getDeliveryCharge() {
		return deliveryCharge;
	}

	double calculateDiscount() {
		double discountAmount = 0;
		if(getCartAmount() >= 5000) {
			discountAmount = getCartAmount() * (discountPercent/100);
		}
		else {
			discountAmount = 0;
		}
		return discountAmount;
	}
	
	int deliverCharge() {
		if(getCartAmount() >= 5000) {
			deliveryCharge = 0;
		}
		return deliveryCharge;
	}
	
	double calculateFinalAmount() {
		double bill = getCartAmount() - calculateDiscount() + deliverCharge();
		return bill;
	}
	
	void displayBill() {
		System.out.println("Payable Amount: "+calculateFinalAmount());
	}
	
	
	
}
