package com.kodewala.object.bank;

public class Bank {
	String customerName = "Ayush kumar";
	int balance;
	String accType;
	String bankName;
	int yearOfOperation;
	
	void customerDetails() {
		System.out.println("Name:- "+customerName);
		System.out.println("Account Type:- "+accType);
		System.out.println("Bank Name:- "+bankName);
	}
	
	void bankBalance() {
		System.out.println("Balance:- "+balance);
	}
}
