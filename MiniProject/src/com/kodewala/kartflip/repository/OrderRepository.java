package com.kodewala.kartflip.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//imported for accessing order data;
import com.kodewala.kartflip.model.Order;

public class OrderRepository {
	private Map<String, Order> orders = new HashMap<String, Order>();
	
	// adding order
	public void addOrder(String orderId, Order order) {
		orders.put(orderId, order);
	}

	// removing order
	public void removeOrder(String orderId) {
		orders.remove(orderId);
	}

	// searching order
	public Order getOrderById(String orderId) {
		return orders.get(orderId);
	}

	// view all Order
	public Collection<Order> viewAll() {
		return orders.values();
	}
}
