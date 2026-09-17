package com.kodewala.pr1;

public abstract class PaymentSystem {
	abstract void doTrxn();
	abstract void txnSuspend();
	abstract void txnOnHold();
}

class Upi extends PaymentSystem{
	
	void doTrxn() {
		System.out.println("Trxn done");
	}
	
	void txnSuspend() {
		System.out.println("Transaction failed");
	}
	
	void txnOnHold() {
		System.out.println("Transaction ON HOLD");
	}
}

class Card extends PaymentSystem{
	void doTrxn() {
		System.out.println("Trxn done");
	}
	
	void txnSuspend() {
		System.out.println("Transaction failed");
	}
	
	void txnOnHold() {
		System.out.println("Transaction ON HOLD");
	}
}


