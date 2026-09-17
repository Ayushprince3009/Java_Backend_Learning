package com.kodewala.method.With_returnType;

public class ZomotoDeliveryApp {
	
	public static int gstPercentage = 12;
	public static void main(String[] args) {
		String customerName = args[0];
		String customerType = args[1];
		String orderAmountStr = args[2];
		
		int orderAmount = Integer.parseInt(orderAmountStr);
		
		discountPercent(customerName, customerType, orderAmount);
		
	}
	
	public static int discountPercent(String customerName, String customerType, int orderAmount) {
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
		
		discountAmount(customerName, customerType, orderAmount, discountPercentage);
		
		return discountPercentage;
	}
	
	public static double discountAmount(String customerName, String customerType, int orderAmount, int discountPercentage) {
		double discountMoney = orderAmount * (discountPercentage/100.0);
		
		deliveryCharge(customerName, customerType, orderAmount, discountMoney);
		return discountMoney;
	}
	
	public static int deliveryCharge(String customerName, String customerType, int orderAmount, double discountMoney) {
		int deliveryFee;
		if(customerType.equalsIgnoreCase("PRIME") || orderAmount >= 3000) {
			deliveryFee = 0;
		}
		else {
			deliveryFee = 55;
		}
		
		gstAmount(customerName, customerType, orderAmount, discountMoney, deliveryFee);
		return deliveryFee;
	}
	
	public static  double gstAmount(String customerName, String customerType, int orderAmount, double discountMoney, int deliveryFee) {
		double gstTaxAmount = orderAmount * (ZomotoDeliveryApp.gstPercentage/100.0);
		
		payableAmount(customerName, orderAmount, discountMoney, deliveryFee, gstTaxAmount);
		return gstTaxAmount;
	}
	
	public static double payableAmount(String customerName, int orderAmount, double discountMoney, int deliveryFee, double gstTaxAmount) {
		double finalBill = (orderAmount + gstTaxAmount + deliveryFee) - discountMoney;
		
		displayBill(customerName, orderAmount, discountMoney, deliveryFee, gstTaxAmount, finalBill);
		return finalBill;
	}
	
	public static void displayBill(String customerName, int orderAmount, double discountMoney, int deliveryFee, double gstTaxAmount, double finalBill) {
		System.out.println("Customer Name:- "+customerName);
		System.out.println("Order Amount:- "+orderAmount);
		System.out.println("Discount Money:- "+discountMoney);
		System.out.println("Delivery Fee:- "+deliveryFee);
		System.out.println("GST Amount:- "+gstTaxAmount);
		System.out.println("Amount to Pay:- RS."+finalBill);
	}
	
}
