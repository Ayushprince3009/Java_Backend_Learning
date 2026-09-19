package com.kodewala.interfaace.pq1;

public class Driver {
	public static void main(String[] args) {
		Payment p1 = new CardPayment();
		p1.pay();
		
		
		Payment p2 = new CashPayment();
		p2.pay();
		p2.receipt();
	}
}

interface Payment{
	public abstract void pay();
	
	default void receipt() {
		System.out.println("Payment receipt generated");
	}
}

class CashPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("Payment Done using CashPayment");
	}
	
	@Override
	public void receipt() {
		System.out.println("Payment reciept generated for CashPaymnet");
	}
}

class CardPayment implements Payment{
	@Override
	public void pay() {
		System.out.println("Payment Done using CardPayment");
	}
	
}