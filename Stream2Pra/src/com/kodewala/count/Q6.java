//package com.kodewala.count;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class Order {
//    int id;
//    String customer;
//    String status;
//    int amount;
//    List<String> products;
//
//    Order(int id, String customer, String status,
//          int amount, List<String> products) {
//        this.id = id;
//        this.customer = customer;
//        this.status = status;
//        this.amount = amount;
//        this.products = products;
//    }
//}
//public class Q6 {
//	public static void main(String[] args) {
//		List<Order> orders = Arrays.asList(
//			    new Order(601, "Asha", "PAID", 24000,
//			        Arrays.asList("Laptop", "Mouse", "Keyboard")),
//			    new Order(602, "Rohan", "PAID", 18000,
//			        Arrays.asList("Mouse", "Monitor")),
//			    new Order(603, "Meera", "FAILED", 32000,
//			        Arrays.asList("Laptop", "Phone")),
//			    new Order(604, "Asha", "PAID", 30000,
//			        Arrays.asList("Laptop", "Webcam", "Mouse")),
//			    new Order(605, "Kabir", "PAID", 12000,
//			        Arrays.asList("Phone", "Charger")),
//			    new Order(606, "Rohan", "PAID", 27000,
//			        Arrays.asList("Monitor", "Keyboard", "Mouse")),
//			    new Order(607, "Neha", "PAID", 22000,
//			        Arrays.asList("Laptop", "Charger", "Webcam")),
//			    new Order(608, "Meera", "PAID", 16000,
//			        Arrays.asList("Phone", "Mouse"))
//			);
//		
//		List<String> result = orders.stream()
//				.filter(order -> order.status.equalsIgnoreCase("paid") && order.amount >= 20000)
//				.map(order -> order.customer)
//				.distinct()
//				.sorted()
//				.skip(1)
//				.limit(2)
//				.collect(Collectors.toList());
//		System.out.println(result);
//		
//		long count = orders.stream()
//				.filter(order -> order.status.equalsIgnoreCase("paid") && order.amount >= 20000)
//				.flatMap(order -> order.products.stream())
//				.distinct()
//				.sorted()
//				.filter(order -> order.length() >= 6)
//				.filter(order -> order.charAt(0) >= 'B' && order.charAt(0) <= 'T')
//				.count();
//		System.out.println(count);
//	}
//}
