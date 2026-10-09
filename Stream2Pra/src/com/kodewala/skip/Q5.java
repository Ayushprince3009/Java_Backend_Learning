package com.kodewala.skip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int productId;
    String name;
    String category;
    int stock;
    int price;

    Product(int productId, String name, String category, int stock, int price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.price = price;
    }
}
public class Q5 {
	public static void main(String[] args) {
		List<List<Product>> warehouseProducts = Arrays.asList(
			    Arrays.asList(
			        new Product(501, "Laptop", "Electronics", 15, 65000),
			        new Product(502, "Mouse", "Electronics", 40, 800),
			        new Product(503, "Office Chair", "Furniture", 25, 7000)
			    ),
			    Arrays.asList(
			        new Product(504, "Keyboard", "Electronics", 30, 1500),
			        new Product(505, "Monitor", "Electronics", 8, 12000),
			        new Product(506, "Desk", "Furniture", 20, 9000)
			    ),
			    Arrays.asList(
			        new Product(507, "Headphones", "Electronics", 50, 2500),
			        new Product(508, "Webcam", "Electronics", 18, 3000),
			        new Product(509, "Printer", "Electronics", 12, 15000)
			    )
			);
		List<String>result = warehouseProducts.stream()
				.flatMap(ware -> ware.stream())
				.filter(ware -> ware.category.equalsIgnoreCase("electronics") && ware.stock >= 15 && ware.price<10000)
				.skip(2)
				.limit(3)
				.map(ware -> ware.productId+" --> "+ware.name+" --> "+ware.stock)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
