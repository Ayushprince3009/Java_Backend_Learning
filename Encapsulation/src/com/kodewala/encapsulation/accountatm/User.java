package com.kodewala.encapsulation.accountatm;

public class User {
	public static void main(String[] args) {
		Account user1 = new Account("123456789","AYUSH",500);
		System.out.println("Account Number:- "+user1.getAccountNumber());
		System.out.println("Account Holder Name:- "+ user1.getName());
		System.out.println("Account Balance:- "+user1.getBalance());
		
		user1.deposit(4000);
		System.out.println("Account Balance:- "+user1.getBalance());
		
		user1.withdrawal(3000);
		
	}
}
