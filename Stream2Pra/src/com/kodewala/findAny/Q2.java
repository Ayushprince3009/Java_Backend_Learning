//package com.kodewala.findAny;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//class Order {
//    int orderId;
//    String status;
//    String customer;
//    int amount;
//    List<String> products;
//
//    Order(int orderId, String status, String customer,
//          int amount, List<String> products) {
//        this.orderId = orderId;
//        this.status = status;
//        this.customer = customer;
//        this.amount = amount;
//        this.products = products;
//    }
//}
//public class Q2 {
//	public static void main(String[] args) {
//		List<Order> orders = Arrays.asList(
//			    new Order(101, "PAID", "Rahul", 15000,
//			        Arrays.asList("Laptop", "Mouse")),
//			    new Order(102, "PENDING", "Priya", 8000,
//			        Arrays.asList("Keyboard", "Mouse")),
//			    new Order(103, "PAID", "Amit", 25000,
//			        Arrays.asList("Monitor", "Keyboard")),
//			    new Order(104, "PAID", "Neha", 12000,
//			        Arrays.asList("Laptop", "Webcam")),
//			    new Order(105, "CANCELLED", "Karan", 30000,
//			        Arrays.asList("Phone", "Charger")),
//			    new Order(106, "PAID", "Sneha", 18000,
//			        Arrays.asList("Mouse", "Headphones"))
//			);
//		Optional<String> result = orders.stream()
//				.filter(order -> (order.amount >= 15000) && order.status.equalsIgnoreCase("PAID"))
//				.flatMap(order -> order.products.stream())
//				.distinct()
//				.sorted()
//				.filter(pro -> pro.startsWith("M"))
//				.findAny();
//		System.out.println(result);
//	}
//}
