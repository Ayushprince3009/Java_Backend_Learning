package com.kodewala.findFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Product {
    int id;
    String name;
    String category;
    int price;
    int stock;

    Product(int id, String name, String category, int price, int stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }
}
public class Q2 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
			    new Product(1, "Laptop", "Electronics", 70000, 5),
			    new Product(2, "Mouse", "Electronics", 1200, 20),
			    new Product(3, "Keyboard", "Electronics", 2500, 0),
			    new Product(4, "Laptop", "Electronics", 65000, 8),
			    new Product(5, "Monitor", "Electronics", 15000, 10),
			    new Product(6, "Chair", "Furniture", 8000, 15),
			    new Product(7, "Monitor", "Electronics", 18000, 3),
			    new Product(8, "Desk", "Furniture", 12000, 0),
			    new Product(9, "Headphones", "Electronics", 3000, 12)
			);
		Optional<String> result = products.stream()
				.filter(pro -> pro.category.equalsIgnoreCase("electronics") && (pro.stock > 0) && (pro.price >= 2000))
				.sorted((pro1, pro2) -> Integer.compare(pro2.price, pro1.price))
				.map(pro -> pro.name)
				.distinct()
				.skip(1)
				.findFirst();
		System.out.println(result);
	}
}
