package com.method;
public class DiscountPercent{
	public static void main(String[] args) {
		String customerId = args[0];
		String customerName = args[1];
		String customerType = args[2];
		String amountStr = args[3];
		
		int amount = Integer.parseInt(amountStr);
		
		System.out.println("Customer ID:- "+customerId);
		System.out.println("Customer Name:- "+customerName);
		System.out.println("Customer Type:- "+customerType);
		System.out.println("Booking Amount:- "+amount);
		
		discountPercentage(customerType, amount);
	}
	
	public static void discountPercentage(String customerType, int amount) {
		int discount;
		if(customerType.equalsIgnoreCase("VIP")) {
			discount = 20;
		}
		else if(customerType.equalsIgnoreCase("PREMIUM")) {
			discount = 10;
		}
		else {
			discount = 5;
		}
		
		System.out.println("Discount Percentage:-"+discount);
		discountAmount(amount, discount);
	}
	
	public static void discountAmount(int amount, int discount) {
		double discountAmount = amount * discount / 100;
		
		System.out.println("Discount Amount:- "+discountAmount);
		finalAmount(amount, discountAmount);
	}
	
	public static void finalAmount(int amount, double discountAmount) {
		double payableAmount = amount - discountAmount;
		System.out.println("Amount to pay RS."+payableAmount);
	}
}