package com.kodewala.multithrea.practice7;

public class TransferThread1 extends Thread {
	private BankAccount sender;
	private BankAccount reciver;
	
	public TransferThread1(BankAccount sender, BankAccount reciver) {
		this.sender = sender;
		this.reciver = reciver;
	}
	
	public void run() {
		sender.transfer(reciver, 800);
	}
}
