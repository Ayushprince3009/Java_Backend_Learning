package com.kodewala.kartflip.model;

import java.util.List;

public class Order {
	private String orderId;
	private String customerId;
	private List<CartItem> cartItems;
	private double totalAmount;
	private String orderStatus;
	private String orderDate;
	
	public Order( String orderStatus,String orderDate) {
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
	}

	
	public String getOrderId() {
		return orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public List<CartItem> getCart() {
		return cartItems;
	}

	public double getTotalAmount() {
//		double totalAmount = 
		return totalAmount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderDate() {
		return orderDate;
	}
}
