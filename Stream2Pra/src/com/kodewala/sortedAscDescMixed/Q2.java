package com.kodewala.sortedAscDescMixed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    String category;
    int price;

    Product(int id, String name, String category, int price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + category + " | " + price;
    }
}

public class Q2 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
			    new Product(1, "Laptop", "Electronics", 75000),
			    new Product(2, "Mouse", "Electronics", 1200),
			    new Product(3, "Keyboard", "Electronics", 2500),
			    new Product(4, "Chair", "Furniture", 8500),
			    new Product(5, "Monitor", "Electronics", 18000),
			    new Product(6, "Desk", "Furniture", 12000),
			    new Product(7, "Headphones", "Electronics", 3500),
			    new Product(8, "Webcam", "Electronics", 4500)
			);
		
		List<String> result = products.stream()
				.filter(pro -> pro.category.equals("Electronics"))
				.filter(pro -> pro.price < 20000)
				.sorted((pro1, pro2) -> Integer.compare(pro1.price, pro2.price))
				.map(pro -> pro.name)
				.collect(Collectors.toList());
		System.out.println(result);
				
	}
}
