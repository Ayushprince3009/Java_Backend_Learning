package com.kodewala.encapsulation.mobilestore;

public class Driver {
	public static void main(String[] args) {
		//brand *model *price *stock
		Mobile cus1 = new Mobile("Samsung", "S23", 56490, 0);
		cus1.displayDetails();
		
		cus1.purchaseMobile(2);
		cus1.reStock(5);
		cus1.purchaseMobile(2);
	}
}
