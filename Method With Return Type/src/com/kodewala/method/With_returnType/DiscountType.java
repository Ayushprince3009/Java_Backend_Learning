package com.kodewala.method.With_returnType;

public class DiscountType {
	/*
	 * Calculate the discount percentage and final amount based on the coustmer
	 * type.
	 */
	public static void main(String args[]) {
		//String customerId = args[0];
		String customerId = "zom123";
		
		//String customerName = args[1];
		String customerName = "Ayush kumar";
		
		//String customerType = args[2];
		String customerType = "regular";
		
		//String purchaseAmountStr = args[3];

		//int purchaseAmount = Integer.parseInt(purchaseAmountStr);
				int purchaseAmount = 2000;

		double discout_percentage = discountPercentage(customerType);
		double discount_amount = discountAmountMoney(purchaseAmount, discout_percentage);
		double total_bill = finalAmount(purchaseAmount, discount_amount);
		
		System.out.println("Customer ID:- "+customerId);
		System.out.println("Customer Name:- "+customerName);
		System.out.println("Customer Type:- "+customerType);
		System.out.println("Cart Value:- "+purchaseAmount);
		System.out.println("Discount Percentage:- "+discout_percentage);
		System.out.println("Discount Amount:- "+discount_amount);
		System.out.println("Payable Amount:- " + total_bill);
	}

	public static double discountPercentage(String type) {
		double discountPercentage;
		if (type.equalsIgnoreCase("VIP")) {
			discountPercentage = 20;
			
		} else if (type.equalsIgnoreCase("Premium")) {
			discountPercentage = 10;
			
		} else if (type.equalsIgnoreCase("Regular")) {
			discountPercentage = 5;
			
		} else {
			discountPercentage = 0;
			
		}
		
		return discountPercentage;
	}

	public static double discountAmountMoney(int amount, double percent) {
		double moneyDiscount = amount * percent / 100;
		
		return moneyDiscount;
	}

	public static double finalAmount(int amount, double discount) {
		double totalBill = amount - discount;
		return totalBill;
	}
}
