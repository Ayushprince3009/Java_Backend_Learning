package com.kodewala.encapsulation.onlineshopping;

//* orderId* customerName* productName* quantity* pricePerItem
public class Driver {
	public static void main(String[] args) {
		Order order = new Order("AMZN1234", "Price", "Watch", 2, 1450);
		order.displayDedtails();
		
		order.setCustomerName("Ayush");
		order.setOrderId("AMZN09786");
		order.setPricePerItem(3500);
		order.setProductQuantiy(5);
		order.setProductName("mango");
		
		order.displayDedtails();
		
	}
}
