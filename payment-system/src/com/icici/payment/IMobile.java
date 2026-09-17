package com.icici.payment;

public class IMobile {

	public static void main(String[] args) {
		System.out.println("IMobile.main() start");
		
		doPayment(1000, "123456789", "987654321", "8765431234");
		System.out.println("Main End");
	}
	
	private static void doPayment(int amount, String recAccNo, String senderAccNo, String mob) {
		System.out.println("doPayment Start ");
		System.out.println(amount);
		System.out.println(recAccNo);
		System.out.println(senderAccNo);
		System.out.println(mob);
		
		
		sendSMS(mob);
		System.out.println("doPayment End");
	}
	
	private static void sendSMS(String mobile) {
		System.out.println("sendSMS Start ");
		System.out.println("trxn done....... sending notification to mobile "+mobile);
		System.out.println("sendSMS End");
	}

}
