package com.kodewala.kartflip.service;

import java.util.Collection;
import java.util.Random;

import com.kodewala.kartflip.model.Product;
import com.kodewala.kartflip.repository.ProductRepository;

public class ProductService {
	private ProductRepository productRepository = new ProductRepository();

	public void addProduct(String productName, String category, double price, int quantity, String brand) {

		// validate inputs
		if (price <= 0) {
			System.out.println("Price of the Product must be greater than Zero");
			return;
		}

		if (quantity <= 0) {
			System.out.println("Can't add product which have invalid quantity");
			return;
		}

		if (productName == null || productName.trim().isEmpty()) {
			System.out.println("Can't add a product without a valid name");
			return;
		}

		if (!productName.matches(".*[a-zA-Z].*")) {
			System.out.println("Product name must contain at least one letter");
			return;
		}

		if (category == null || category.trim().isEmpty()) {
			System.out.println("Can't add a product without a valid category");
			return;
		}

		if (!category.matches(".*[a-zA-Z].*")) {
			System.out.println("Category must contain at least one letter");
			return;
		}

		if (brand == null || brand.trim().isEmpty()) {
			System.out.println("Can't add a product without a valid brand");
			return;
		}

		if (!brand.matches(".*[a-zA-Z].*")) {
			System.out.println("Brand must contain at least one letter");
			return;
		}

		// generate product ID
		String productId = generateProductId(productName);

		// Create the Product object
		Product product = new Product(productId, productName, category, price, quantity, brand);

		// Store it to the repository
		productRepository.addProduct(productId, product);

		System.out.println("Product added successfully");
	}

	// view all products
	public Collection<Product> viewAll() {
		return productRepository.viewAll();
	}
	
	

	private String generateProductId(String productName) {
		String prefix;

		if (productName.length() >= 3) {
			prefix = productName.substring(0, 3);
		} else {
			prefix = productName;
		}

		prefix = prefix.toUpperCase();

		Random random = new Random();

		String productId;

		do {
			int number = random.nextInt(9000) + 1000;
			productId = "PRO" + prefix + number;
		} while (productRepository.getProductById(productId) != null);

		return productId;
	}

}
