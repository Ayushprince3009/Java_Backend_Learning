/*Create a BankAccount class.

Fields:
accountNumber
balance
Pass values from main().*/

package com.kodewala.object.constructor.learning;

public class BankAccount {

	public static void main(String[] args) {
		Account acc2 = new Account();
		Account acc1 = new Account(3986787, 24);

	}

}

class Account{
	private long AccountNumber;
	private int balance;
	
	Account(long _AccountNumber, int _balance){
		this.AccountNumber = _AccountNumber;
		this.balance = _balance;
		System.out.println(AccountNumber);
		System.out.println(balance);
	}
	
	Account(){
		
	}
}