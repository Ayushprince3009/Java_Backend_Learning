package com.kodewala.interfac.backwardcompatibility.pq1;

public interface IFoodDelivery {
	void orderFood();
	void pay();
	public abstract void track();
	abstract void rate();
	
	public default void repeatOrder() {
		System.out.println("Repeat");
	}
}
