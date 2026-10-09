package com.kodewala.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Inventory {
    int productId;
    String productName;
    String category;
    int stock;

    Inventory(int productId, String productName, String category, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.stock = stock;
    }
}
public class Q5 {
	public static void main(String[] args) {
		List<List<Inventory>> wareHouse = Arrays.asList(
			    Arrays.asList(
			        new Inventory(301, "Laptop", "Electronics", 8),
			        new Inventory(302, "Mouse", "Electronics", 25),
			        new Inventory(303, "Office Chair", "Furniture", 12)
			    ),
			    Arrays.asList(
			        new Inventory(304, "Keyboard", "Electronics", 18),
			        new Inventory(305, "Monitor", "Electronics", 5),
			        new Inventory(306, "Desk", "Furniture", 20)
			    ),
			    Arrays.asList(
			        new Inventory(307, "Headphones", "Electronics", 30),
			        new Inventory(308, "Webcam", "Electronics", 15),
			        new Inventory(309, "Printer", "Electronics", 10)
			    )
			);
		
		List<String> result  =  wareHouse.stream()
				.flatMap(ware -> ware.stream())
				.filter(pro -> pro.category.equalsIgnoreCase("electronics") && pro.stock >= 10)
				.limit(4)
				.map(pro -> pro.productId+" ---> "+pro.productName+" ---> "+pro.stock)
				.collect(Collectors.toList());
		System.out.println(result);
				
	}
}
