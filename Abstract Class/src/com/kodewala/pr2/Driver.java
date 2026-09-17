package com.kodewala.pr2;

public class Driver {
	public static void main(String[] args) {
		OrderManagement order = new RetailUser();
		System.out.println("Order Details");
		order.placeOrder();
		order.confirmOrder();
		order.editOrder();
		order.getOrderStatus();
		System.out.println("---------------------");
		
		OrderManagement order1 = new PremiumUser();
		System.out.println("Order1 Details");
		order1.placeOrder();
		order1.confirmOrder();
		order1.editOrder();
		order1.getOrderStatus();
		System.out.println("---------------------");
		
		OrderManagement order2 = new Resellers();
		System.out.println("Order2 Details");
		order2.placeOrder();
		order2.confirmOrder();
		order2.editOrder();
		order2.getOrderStatus();
		System.out.println("---------------------");
	}
}
