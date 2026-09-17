package com.kodewala.encapsulation.bank.atm;

public class ATM {
	private double balance;
	private String PIN;
	
	
	public ATM(double balance, String pin){
		this.balance = balance;
		this.PIN = pin;
	}
	void deposit(double amount, String pin) {
		if(PIN.equals(pin) && amount > 0) {
			balance += amount;
			System.out.println("Current Balance:- "+balance);
		}
		else {
			System.out.println("Deposit a Valid Amount or Entered PIN is incorrect");
		}
	}
	
	void withdraw(double amount,String pin) {
		if(PIN.equals(pin) && (amount > 0 && amount <= balance)) {
			balance -= amount;
			System.out.println("Current Balance:- "+balance);
		}
		else {
			System.out.println("Enter valid amount or Enter Correct PIN");
		}
	}
	
	public void getBalance() {
		System.out.println("Account Balance:- "+balance);
	}
}
 