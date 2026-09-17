package com.kodewala.method.With_returnType;

public class Zomato {
	public static int gstPercentage = 12;
	public static void main(String[] args) {
		String customerName = args[0];
		String customerType = args[1];
		String orderAmountStr = args[2];
		
		int orderAmount = Integer.parseInt(orderAmountStr);
		
		
		if(orderAmount > 100) {
			System.out.println("Customer Name:- "+customerName);
			
			int result = discountPercent( customerType, orderAmount);
			System.out.println(result);
			
			double result1 = discountAmount( orderAmount, result);
			System.out.println(result1);
			
			int result2 = deliveryCharge(customerType, orderAmount);
			System.out.println(result2);
			
			double result3 = gstAmount(orderAmount);
			System.out.println(result3);
			
			double result4 = payableAmount(orderAmount, result1, result2, result3);
			
			displayBill(result4);
		}
		else {
			System.out.println("Can not Place Order.");
		}

		
		
	}
	
	public static int discountPercent( String customerType, int orderAmount) {
		int discountPercentage;
		if(customerType.equalsIgnoreCase("PRIME") || orderAmount >= 7000) {
			discountPercentage = 30;
		}
		else if(customerType.equalsIgnoreCase("REGULAR") || (orderAmount >= 2000 && orderAmount <7000)) {
			discountPercentage = 15;
		}
		else {
			discountPercentage = 5;
		}
		
		//discountAmount(customerName, customerType, orderAmount, discountPercentage);
		
		return discountPercentage;
	}
	
	public static double discountAmount(int orderAmount, int discountPercentage) {
		double discountMoney = orderAmount * (discountPercentage/100.0);
		
		//deliveryCharge(customerName, customerType, orderAmount, discountMoney);
		return discountMoney;
	}
	
	public static int deliveryCharge(String customerType, int orderAmount) {
		int deliveryFee;
		if(customerType.equalsIgnoreCase("PRIME") || orderAmount >= 3000) {
			deliveryFee = 0;
		}
		else {
			deliveryFee = 55;
		}
		
		//gstAmount(customerName, customerType, orderAmount, discountMoney, deliveryFee);
		return deliveryFee;
	}
	
	public static  double gstAmount(int orderAmount) {
		double gstTaxAmount = orderAmount * (Zomato.gstPercentage/100.0);
		
		//payableAmount(customerName, orderAmount, discountMoney, deliveryFee, gstTaxAmount);
		return gstTaxAmount;
	}
	
	public static double payableAmount(int orderAmount, double discountMoney, int deliveryFee, double gstTaxAmount) {
		double finalBill = (orderAmount + gstTaxAmount + deliveryFee) - discountMoney;
		
		//displayBill(customerName, orderAmount, discountMoney, deliveryFee, gstTaxAmount, finalBill);
		return finalBill;
	}
	
	public static void displayBill( double finalBill) {
//		System.out.println("Customer Name:- "+customerName);
//		System.out.println("Order Amount:- "+orderAmount);
//		System.out.println("Discount Money:- "+discountMoney);
//		System.out.println("Delivery Fee:- "+deliveryFee);
//		System.out.println("GST Amount:- "+gstTaxAmount);
		System.out.println("Amount to Pay:- RS."+finalBill);
	}
}
