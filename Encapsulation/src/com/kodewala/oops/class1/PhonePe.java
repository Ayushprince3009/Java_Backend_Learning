package com.kodewala.oops.class1;

public class PhonePe {
	private int balance;
	
	public void AcceptMoney(int money) {
		balance = balance + money;
		System.out.println("Account Balance:-"+balance);
	}
	
	public void SendMoney(int money) {
		if(balance > money) {
			balance = balance - money;
			System.out.println("Transferred");
			System.out.println("Remaining Balance:-"+balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	 
}
