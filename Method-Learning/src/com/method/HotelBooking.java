package com.method;
public class HotelBooking{
	
	public static void main(String[] args) {
		String customerName = args[0];
		String roomType = args[1];
		String numberOfDaysStr = args[2];
		String customerType = args[3];
		
		int numberOfDays = Integer.parseInt(numberOfDaysStr);
		perDayRent(customerName, roomType, numberOfDays, customerType);
		
	}
	
	public static void perDayRent(String customerName, String roomType, int numberOfDays, String customerType) {
		int rent;
		if(roomType.equalsIgnoreCase("SUITE")) {
			rent = 9000;
		}
		else if(roomType.equalsIgnoreCase("DELUXE")) {
			rent = 6000;
		}
		else {
			rent = 4000;
		}
		totalAmount(customerName, rent, numberOfDays, customerType);
	}
	
	public static void totalAmount(String customerName, int rent, int numberOfDays, String customerType) {
		int totalAmount = rent * numberOfDays;
		discountPercent(customerName, customerType, totalAmount);
	}
	
	public static void discountPercent(String customerName, String customerType, int totalAmount) {
		int discount;
		if(customerType.equalsIgnoreCase("VIP")) {
			discount = 45;
		}
		else if(customerType.equalsIgnoreCase("REGULAR")) {
			discount = 20;
		}
		else {
			discount = 5;
		}
		
		discountAmount(customerName, discount, totalAmount);
	}
	
	public static void discountAmount(String customerName, int discount, int totalAmount) {
		int discountAmount = totalAmount * discount / 100;
		finalBill(customerName, discountAmount, totalAmount);
	}
	
	public static void finalBill(String customerName, int discountAmount, int totalAmount) {
		int payableAmount = totalAmount - discountAmount;
		
		System.out.println(payableAmount);
	}
}