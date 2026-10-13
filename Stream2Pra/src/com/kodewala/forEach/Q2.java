package com.kodewala.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int stock;
    private List<String> tags;

    public Product(int id, String name, String category,
                   double price, int stock, List<String> tags) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.tags = tags;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public List<String> getTags() { return tags; }
}
public class Q2 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
			    new Product(1, "Laptop", "Electronics", 65000, 8,
			        Arrays.asList("Premium", "Office", "Portable")),
			    new Product(2, "Mouse", "Electronics", 800, 25,
			        Arrays.asList("Office", "Wireless")),
			    new Product(3, "Keyboard", "Electronics", 1500, 0,
			        Arrays.asList("Office", "Gaming")),
			    new Product(4, "Desk", "Furniture", 12000, 5,
			        Arrays.asList("Office", "Wooden")),
			    new Product(5, "Chair", "Furniture", 7000, 12,
			        Arrays.asList("Office", "Ergonomic")),
			    new Product(6, "Headphones", "Electronics", 3500, 7,
			        Arrays.asList("Wireless", "Premium")),
			    new Product(7, "Monitor", "Electronics", 18000, 3,
			        Arrays.asList("Office", "Premium")),
			    new Product(8, "Notebook", "Stationery", 100, 50,
			        Arrays.asList("School", "Office"))
			);
		
		List<String> result = products.stream()
				.filter(pro -> pro.getCategory().equalsIgnoreCase("electronics") && pro.getStock() > 0 && pro.getPrice() >= 3000)
				.map(pro -> pro.getName())
				.collect(Collectors.toList());
		System.out.println(result);
		
		long res = products.stream()
				.filter(pro -> pro.getStock() > 0 && pro.getPrice() > 5000)
				.count();
		System.out.println(res);
		
		List<String> resu = products.stream()
				.filter(pro -> pro.getStock() > 0)
				.flatMap(pro -> pro.getTags().stream())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(resu);
		
		products.stream().filter(pro -> pro.getStock() < 8)
		.forEach(pro -> System.out.println(pro.getName() + " --- "+ pro.getStock()));
		
				
	}
}
