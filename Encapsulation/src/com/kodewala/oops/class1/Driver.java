package com.kodewala.oops.class1;

public class Driver {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(2000);
		account.setName("AYUSH");
		
		System.out.println(account.getBalance());
		System.out.println(account.getName());
	}
}
