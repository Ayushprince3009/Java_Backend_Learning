package com.kodewala.multithrea.practice7;

public class BankDemo {
	public static void main(String[] args) throws InterruptedException {
		
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		Thread phonePay = new TransferThread1(account1, account2);
		Thread gPay = new TransferThread2(account1, account2);
		
		phonePay.start();
		gPay.start();
		
		
		phonePay.join();
		gPay.join();
		
		
		System.out.println("Account 1: "+account1.getBalance());
		System.out.println("Account 2: "+account2.getBalance());
		
	}
}
