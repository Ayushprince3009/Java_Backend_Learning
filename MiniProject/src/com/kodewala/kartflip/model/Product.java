package com.kodewala.kartflip.model;

public class Product {
	private String productId;
	private String productName;
	private String category;
	private double price;
	private int quantity;
	private String brand;
	
	public Product(String _productId, String _productName, String _category, double _price, int _quantity, String _brand) {
		this.productId = _productId;
		this.productName = _productName;
		this.category = _category;
		this.price = _price;
		this.quantity = _quantity;
		this.brand = _brand;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

}
