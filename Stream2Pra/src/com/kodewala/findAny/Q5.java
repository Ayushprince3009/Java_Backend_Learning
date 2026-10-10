package com.kodewala.findAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Order {
    int id;
    String customer;
    String status;
    int amount;
    List<String> items;

    Order(int id, String customer, String status,
          int amount, List<String> items) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.amount = amount;
        this.items = items;
    }
}
public class Q5 {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
			    new Order(101, "Rahul", "DELIVERED", 25000,
			        Arrays.asList("Laptop", "Mouse", "Keyboard")),
			    new Order(102, "Priya", "PENDING", 12000,
			        Arrays.asList("Phone", "Charger")),
			    new Order(103, "Amit", "DELIVERED", 18000,
			        Arrays.asList("Monitor", "Mouse")),
			    new Order(104, "Neha", "DELIVERED", 30000,
			        Arrays.asList("Laptop", "Webcam")),
			    new Order(105, "Karan", "CANCELLED", 40000,
			        Arrays.asList("Tablet", "Keyboard")),
			    new Order(106, "Sneha", "DELIVERED", 22000,
			        Arrays.asList("Headphones", "Monitor", "Phone"))
			);
		
		Optional<String> result = orders.stream()
				.filter(order -> order.status.equalsIgnoreCase("delivered") && order.amount >= 20000)
				.flatMap(order -> order.items.stream())
				.distinct()
				.sorted((item1, item2) -> item2.compareTo(item1))
				.filter(order -> order.contains("o") && order.length() >= 5)
				.findAny();
		System.out.println(result);
	}
}
