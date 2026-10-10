package com.kodewala.findAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Product {
    int id;
    String name;
    String category;
    int price;
    int stock;
    List<String> features;

    Product(int id, String name, String category, int price,
            int stock, List<String> features) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.features = features;
    }
}
public class Q4 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
			    new Product(101, "Laptop", "Electronics", 70000, 5,
			        Arrays.asList("SSD", "WiFi", "Bluetooth")),
			    new Product(102, "Mouse", "Electronics", 1500, 20,
			        Arrays.asList("Wireless", "Bluetooth")),
			    new Product(103, "Monitor", "Electronics", 18000, 0,
			        Arrays.asList("HDMI", "IPS")),
			    new Product(104, "Keyboard", "Electronics", 3000, 10,
			        Arrays.asList("Mechanical", "RGB")),
			    new Product(105, "Tablet", "Electronics", 25000, 8,
			        Arrays.asList("WiFi", "Touchscreen")),
			    new Product(106, "Phone", "Electronics", 40000, 3,
			        Arrays.asList("Bluetooth", "Touchscreen"))
			);
		
		Optional<String> result = products.stream()
				.filter(pro -> pro.category.equalsIgnoreCase("electronics") && pro.stock > 0  && pro.price >= 3000)
				.flatMap(pro -> pro.features.stream())
				.distinct()
				.sorted()
				.filter(pro -> pro.contains("o") && pro.length() > 5)
				.findAny();
		System.out.println(result);
		
		
		}
}
