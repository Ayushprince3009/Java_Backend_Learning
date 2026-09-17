package com.kodewala.encapsulation.bankAccount;

public class BankAccount {
	private double balance;
	private String pin;
	
//	public BankAccount(String enteredPin, double amount) {
//		this.balance = amount;
//		this.pin = enteredPin;
//	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double setBalance) {
		this.balance = setBalance;
	}
	
	public void setPin(String setPin) {
		this.pin = setPin;
	}
	
	public void depositAmount(String enteredPin, double depositAmount) {
		if(enteredPin.equals(pin) && depositAmount > 0) {
			balance += depositAmount;
			System.out.println("Deposited Amount Rs."+depositAmount+" .Current Balance Rs."+balance);
		}
		else {
			System.out.println("Wrong Pin or Invalid Amount");
		}
	}
	
	public void withdrawAmount(String enteredPin, double withdrawAmount) {
		if(enteredPin.equals(pin) && (withdrawAmount > 0 && withdrawAmount < balance)) {
			balance -= withdrawAmount;
			System.out.println("Rs."+withdrawAmount+" withdraw from your account. Current Balance is Rs."+ balance);
		}
		else {
			System.out.println("Entered PIN is Incorrect or Insufficient Balance");
		}
	}
	
	public void displayDetails() {
		System.out.println("Account Balance Rs."+balance);
	}
	
}
