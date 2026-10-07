package com.kodewala.multithrea.practice7;

public class BankDemo {
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		Thread t1 = new TransferThread1(account1, account2);
		Thread t2 = new TransferThread2(account1, account2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
	}
}
