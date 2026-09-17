package com.kodewala.interfac.backwardcompatibility.pq1;

public class Zomato implements IFoodDelivery {

	@Override
	public void orderFood() {
		// TODO Auto-generated method stub
		System.out.println("Ordered through Zomato");
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paid");
	}

	@Override
	public void track() {
		// TODO Auto-generated method stub
		System.out.println("Track Order");
	}

	@Override
	public void rate() {
		// TODO Auto-generated method stub
		System.out.println("Rate the Order");
	}
	
}
