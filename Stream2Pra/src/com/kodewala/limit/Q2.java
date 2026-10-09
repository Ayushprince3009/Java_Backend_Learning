package com.kodewala.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int productId;
    String name;
    String category;
    int unitsSold;
    int price;

    Product(int productId, String name, String category,
            int unitsSold, int price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.unitsSold = unitsSold;
        this.price = price;
    }
}

public class Q2 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
			    new Product(201, "Laptop", "Electronics", 45, 65000),
			    new Product(202, "Mouse", "Electronics", 120, 800),
			    new Product(203, "Office Chair", "Furniture", 35, 7000),
			    new Product(204, "Keyboard", "Electronics", 85, 1500),
			    new Product(205, "Monitor", "Electronics", 60, 12000),
			    new Product(206, "Desk", "Furniture", 25, 9000),
			    new Product(207, "Headphones", "Electronics", 95, 2500),
			    new Product(208, "Webcam", "Electronics", 70, 3000)
			);
		
		List<String> result = products.stream()
				.filter(prod -> (prod.category.equalsIgnoreCase("Electronics")) && (prod.unitsSold >= 60))
				.limit(3)
				.map(prod -> prod.name + " ---> "+prod.unitsSold)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
