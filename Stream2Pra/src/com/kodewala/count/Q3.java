package com.kodewala.count;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Order {
    int id;
    String customer;
    String status;
    int amount;
    List<String> products;

    Order(int id, String customer, String status,
          int amount, List<String> products) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.amount = amount;
        this.products = products;
    }
}
public class Q3 {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
			    new Order(301, "Amit", "DELIVERED", 18000,
			        Arrays.asList("Laptop", "Mouse", "Keyboard")),
			    new Order(302, "Priya", "CANCELLED", 25000,
			        Arrays.asList("Phone", "Charger")),
			    new Order(303, "Rahul", "DELIVERED", 32000,
			        Arrays.asList("Monitor", "Keyboard", "Mouse")),
			    new Order(304, "Amit", "DELIVERED", 22000,
			        Arrays.asList("Laptop", "Webcam")),
			    new Order(305, "Neha", "PROCESSING", 15000,
			        Arrays.asList("Phone", "Headphones")),
			    new Order(306, "Priya", "DELIVERED", 28000,
			        Arrays.asList("Tablet", "Keyboard", "Webcam")),
			    new Order(307, "Rahul", "DELIVERED", 12000,
			        Arrays.asList("Mouse", "Charger")),
			    new Order(308, "Karan", "DELIVERED", 40000,
			        Arrays.asList("Laptop", "Monitor", "Headphones")),
			    new Order(309, "Neha", "DELIVERED", 26000,
			        Arrays.asList("Phone", "Keyboard", "Webcam"))
			);
		
		List<String> result = orders.stream()
				.filter(order -> order.status.equalsIgnoreCase("Delivered") && order.amount >= 18000)
				.map(order -> order.customer)
				.distinct()
				.sorted((cus1, cus2) -> cus2.compareTo(cus1))
				.skip(1)
				.limit(2)
				.collect(Collectors.toList());
		System.out.println(result);
		
		long count = orders.stream()
				.filter(order -> order.status.equalsIgnoreCase("delivered") && order.amount >= 18000)
				.flatMap(order -> order.products.stream())
				.distinct()
				.sorted()
				.filter(order -> order.length() >= 6 && (order.charAt(0) >= 'H' && order.charAt(0) <= 'T'))
				.count();
		System.out.println(count);
				
		
	}
}
