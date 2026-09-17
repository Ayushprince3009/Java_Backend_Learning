package com.kodewala.inheritance.q2;

public class Driver {
	public static void main(String[] args) {
		FoodOrder order = new FoodOrder("C101","Ayush","8540966758","Domino's",3000,"card");
		order.showCustomerDetails();
		order.showDetails();
		order.billDetails();
	}
	
}
