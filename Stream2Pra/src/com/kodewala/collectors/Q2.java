package com.kodewala.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Order {
    int orderId;
    String customer;
    String status;
    double amount;
    List<String> products;

    Order(int orderId, String customer, String status,
          double amount, List<String> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.status = status;
        this.amount = amount;
        this.products = products;
    }
}
public class Q2 {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
			    new Order(101, "Amit", "DELIVERED", 4500,
			        Arrays.asList("Laptop", "Mouse")),
			    new Order(102, "Priya", "PENDING", 1200,
			        Arrays.asList("Keyboard", "Mouse")),
			    new Order(103, "Rahul", "DELIVERED", 7200,
			        Arrays.asList("Laptop", "Headphones")),
			    new Order(104, "Amit", "CANCELLED", 3000,
			        Arrays.asList("Monitor")),
			    new Order(105, "Neha", "DELIVERED", 1800,
			        Arrays.asList("Mouse", "Keyboard")),
			    new Order(106, "Priya", "DELIVERED", 5600,
			        Arrays.asList("Laptop", "Keyboard")),
			    new Order(107, "Karan", "PENDING", 900,
			        Arrays.asList("Mouse", "USB Cable")),
			    new Order(108, "Rahul", "DELIVERED", 4200,
			        Arrays.asList("Monitor", "Mouse")),
			    new Order(109, "Neha", "CANCELLED", 2500,
			        Arrays.asList("Headphones")),
			    new Order(110, "Amit", "DELIVERED", 6800,
			        Arrays.asList("Laptop", "Monitor"))
			);
		
		List<String> result = orders.stream()
				.filter(order -> order.status.equalsIgnoreCase("delivered") && order.amount >= 4000)
				.map(order -> order.customer)
				.distinct()
				.sorted()
				.skip(1)
				.limit(2)
				.collect(Collectors.toList());
		System.out.println(result);
		
		long count = orders.stream()
				.filter(order -> order.status.equalsIgnoreCase("delivered") && order.amount > 4000)
				.filter(order -> order.orderId > 102)
				.collect(Collectors.counting());
		System.out.println(count);
		
		long results = orders.stream()
				.filter(order -> order.status.equalsIgnoreCase("delivered") && order.amount >= 4000)
				.flatMap(order -> order.products.stream())
				.filter(pro -> pro.length() >= 6)
				.filter(pro -> (pro.charAt(0) >= 'A') && (pro.charAt(0) <= 'M'))
				.distinct()
				.sorted()
				.count();
		System.out.println(results);
	}
}
