package com.kodewala.kartflip.repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.kodewala.kartflip.model.Product;

public class ProductRepository {
	private Map<String,Product> products = new HashMap<String,Product>();
	
	//adding product to collection
	public void addProduct(String productId, Product product) {
		products.put(productId, product);
	}
	
	//searching product in collection
	public Product getProductById(String productId) {
		return products.get(productId);
	}
	
	//deleting product from the colelction
	public void removeProduct(String productId) {
		products.remove(productId);
	}
	
	//view all products
	public Collection<Product> viewAll() {
		return products.values();
	}
}
