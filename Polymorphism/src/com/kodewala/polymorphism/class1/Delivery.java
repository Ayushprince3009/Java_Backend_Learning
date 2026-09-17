package com.kodewala.polymorphism.class1;

public class Delivery {
	public void estimateTime(String src, String des) {
		System.out.println("Delivery.estimateTime(String src, String des)");
	}
}

class ExpressDelivery extends Delivery{
	public void estimateTime(String src, String des) {
		System.out.println("ExpressDelivery.estimateTime(String src, String des)");
	}
}

class OneDayDelivery extends ExpressDelivery{
	public void estimateTime(String src, String des) {
		System.out.println("OneDayDelivery.estimateTime(String src, String des)");
	}
}