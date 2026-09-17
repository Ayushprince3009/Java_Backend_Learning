package com.method;

public class ElectricityBill {
	
	static int unitPrice = 8;
	public static void main(String[] args) {
		String userName = args[0];
		String unitConsumedStr = args[1];
		
		int unitConsumed = Integer.parseInt(unitConsumedStr);
		
		billAmount(userName, unitConsumed);
		
	}
	
	public static void billAmount(String userName, int  unitConsumed) {
		int totalAmount = unitConsumed * ElectricityBill.unitPrice;
		
		discount(userName, totalAmount);
	}
	
	public static void discount(String userName, int totalAmount) {
		int discount;
		if(totalAmount > 5000) {
			discount = 1100;
		}
		else if(totalAmount > 2500 && totalAmount <= 5000) {
			discount = 450;
		}
		else {
			discount = 0;
		}
		
		finalBill(userName, totalAmount, discount);
	}
	
	public static void finalBill(String userName, int totalAmount, int discount) {
		int payableAmount = totalAmount - discount;
		System.out.println("Consumer Name:- "+userName);
		System.out.println("Total Amount:- "+totalAmount);
		System.out.println("Payable Amount:- "+payableAmount);
		System.out.println("Discount:- "+discount);
	}

}
