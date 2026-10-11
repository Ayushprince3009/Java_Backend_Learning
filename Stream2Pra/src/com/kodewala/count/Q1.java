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
//public class Q1 {
//	public static void main(String[] args) {
//		List<Order> orders = Arrays.asList(
//			    new Order(101, "Rahul", "PAID", 25000,
//			        Arrays.asList("Laptop", "Mouse", "Keyboard")),
//			    new Order(102, "Priya", "PENDING", 12000,
//			        Arrays.asList("Phone", "Charger")),
//			    new Order(103, "Amit", "PAID", 18000,
//			        Arrays.asList("Monitor", "Mouse")),
//			    new Order(104, "Rahul", "PAID", 30000,
//			        Arrays.asList("Laptop", "Webcam")),
//			    new Order(105, "Karan", "CANCELLED", 40000,
//			        Arrays.asList("Tablet", "Keyboard")),
//			    new Order(106, "Sneha", "PAID", 22000,
//			        Arrays.asList("Headphones", "Monitor", "Phone")),
//			    new Order(107, "Amit", "PAID", 35000,
//			        Arrays.asList("Keyboard", "Mouse", "Webcam")),
//			    new Order(108, "Neha", "PAID", 15000,
//			        Arrays.asList("Laptop", "Charger"))
//			);
//		
//		List<String> res = orders.stream()
//				.filter(order -> order.status.equalsIgnoreCase("PAID") && order.amount >= 20000)
//				.map(order -> order.customer)
//				.distinct()
//				.sorted((cus1, cus2) -> cus2.compareTo(cus1))
//				.skip(1)
//				.limit(2)
//				.collect(Collectors.toList());
//		System.out.println(res);
//			
//				
//		
//		long count = orders.stream()
//			    .filter(order -> order.status.equalsIgnoreCase("PAID")
//			            && order.amount >= 20000)
//			    .flatMap(order -> order.products.stream())
//			    .distinct()
//			    .sorted()
//			    .filter(product -> product.length() > 5)
//			    .count();
//
//			System.out.println(count);
//	}
//}
