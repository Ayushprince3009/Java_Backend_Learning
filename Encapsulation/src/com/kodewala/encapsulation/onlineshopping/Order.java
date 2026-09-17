package com.kodewala.encapsulation.onlineshopping;

public class Order {
	private String orderId;
	private String customerName;
	private String productName;
	private int productQuantity;
	private int pricePerItem;
	
	public Order(String orderId, String customerName, String productName, int quantity, int unitPrice) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.productName = productName;
		setProductQuantiy(quantity);
		setPricePerItem(unitPrice);
		//this.productQuantity = quantity;  //will require logic so come back to set logic after setter
		//this.pricePerItem = unitPrice;     //will require logic so come back to set logic after setter
	}
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String setProductName(String productName) {
		return productName;
	}
	public String getProductName() {
		return productName;
	}
	
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantiy(int quantity) {
		if(quantity >= 1) {
			this.productQuantity = quantity;
		}
		else {
			this.productQuantity = 0;
		}
		
	}
	
	public int getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(int unitPrice) {
		if(unitPrice > 0) {
			this.pricePerItem = unitPrice;
		}else {
			this.pricePerItem = 0;
		}	
	}
	
	public int calculateTotalAmount() {
		int finalAmount = productQuantity * pricePerItem;
		return finalAmount;
	}
	//* orderId* customerName* productName* quantity* pricePerItem
	public void displayDedtails() {
		System.out.println("Order Id:- "+orderId);
		System.out.println("Customer Name:- "+customerName);
		System.out.println("Product Name:- "+productName);
		System.out.println("Quantity:- "+productQuantity);
		System.out.println("Unit Price:- "+pricePerItem);
		System.out.println("Payable Amount:- "+calculateTotalAmount());
		System.out.println();
	}
	
}
