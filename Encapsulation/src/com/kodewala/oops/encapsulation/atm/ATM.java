package com.kodewala.oops.encapsulation.atm;

public class ATM {
	private double balance = 1000;
	private String pin = "1234";
	
	public void deposit(String enteredPin, double depositAmount) {
		if(enteredPin.equals(pin) && depositAmount > 0) {
			balance += depositAmount;
			System.out.println("Rs."+depositAmount+" deposited in your account. Current Balance is Rs."+ balance);
		}
		else {
			System.out.println("Entered PIN is Incorret or Invalid Amount");
		}
	}
	
	public void withdraw(String enteredPin, double withdrawAmount) {
		if(enteredPin.equals(pin) && (withdrawAmount > 0 && withdrawAmount < balance)) {
			balance -= withdrawAmount;
			System.out.println("Rs."+withdrawAmount+" withdraw from your account. Current Balance is Rs."+ balance);
		}
		else {
			System.out.println("Entered PIN is Incorrect or Insufficient Balance");
		}
	}
	
	public double getBalance() {
		return balance;
	}
}
