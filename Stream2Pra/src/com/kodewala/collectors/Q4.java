package com.kodewala.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    String category;
    String status;
    double price;
    List<String> tags;

    Product(int id, String name, String category,
            String status, double price, List<String> tags) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.status = status;
        this.price = price;
        this.tags = tags;
    }
}
public class Q4 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
			    new Product(301, "Laptop", "Electronics", "ACTIVE", 75000,
			        Arrays.asList("Premium", "Office", "Popular")),
			    new Product(302, "Mouse", "Accessories", "ACTIVE", 1200,
			        Arrays.asList("Wireless", "Office")),
			    new Product(303, "Keyboard", "Accessories", "INACTIVE", 3500,
			        Arrays.asList("Mechanical", "Gaming")),
			    new Product(304, "Monitor", "Electronics", "ACTIVE", 18000,
			        Arrays.asList("Office", "Display")),
			    new Product(305, "Headphones", "Accessories", "ACTIVE", 6500,
			        Arrays.asList("Wireless", "Premium")),
			    new Product(306, "Tablet", "Electronics", "ACTIVE", 28000,
			        Arrays.asList("Portable", "Display", "Premium")),
			    new Product(307, "Webcam", "Accessories", "INACTIVE", 4200,
			        Arrays.asList("Office", "Streaming")),
			    new Product(308, "Printer", "Electronics", "ACTIVE", 12500,
			        Arrays.asList("Office", "Wireless")),
			    new Product(309, "Speaker", "Accessories", "ACTIVE", 8500,
			        Arrays.asList("Audio", "Portable")),
			    new Product(310, "Router", "Electronics", "ACTIVE", 5500,
			        Arrays.asList("Wireless", "Networking"))
			);
		
		List<String> res = products.stream()
				.filter(pro -> pro.status.equalsIgnoreCase("Active") && pro.price >= 5000)
				.map(pro -> pro.name)
				.distinct()
				.sorted()
				.skip(1)
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(res);
		
		long ress = products.stream()
				.filter(pro -> pro.status.equalsIgnoreCase("active") && pro.category.equalsIgnoreCase("electronics"))
				.filter(pro -> pro.price > 10000 && pro.id > 303)
				.collect(Collectors.counting());
		System.out.println(ress);
		
		long count = products.stream()
				.filter(pro -> pro.status.equalsIgnoreCase("active") && pro.price >= 5000)
				.flatMap(pro -> pro.tags.stream())
				.filter(tag -> tag.length() >= 6)
				.filter(tag -> ((tag.charAt(0) >= 'O') && (tag.charAt(0) <= 'W')))
				.distinct()
				.sorted()
				.count();
		System.out.println(count);
		
		
		
	}
}
