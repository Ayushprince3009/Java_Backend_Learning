package com.kodewala.pr2;

class RetailUser extends OrderManagement {
	@Override
	void placeOrder() {
		System.out.println("Order placed");
	}

	@Override
	void editOrder() {
		System.out.println("Order edited");
	}

	@Override
	void confirmOrder() {
		System.out.println("Order confirmed");
	}
}

class PremiumUser extends OrderManagement {
	@Override
	void placeOrder() {
		System.out.println("Order placed");
	}

	@Override
	void editOrder() {
		System.out.println("Order edited");
	}

	@Override
	void confirmOrder() {
		System.out.println("Order confirmed");
	}
}

class Resellers extends OrderManagement {
	@Override
	void placeOrder() {
		System.out.println("Order placed");
	}

	@Override
	void editOrder() {
		System.out.println("Order edited");
	}

	@Override
	void confirmOrder() {
		System.out.println("Order confirmed");
	}
}
