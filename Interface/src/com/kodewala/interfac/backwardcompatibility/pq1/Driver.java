package com.kodewala.interfac.backwardcompatibility.pq1;

public class Driver {
	public static void main(String[] args) {
		Zomato z = new Zomato();
		z.orderFood();
		z.pay();
		z.track();
		z.rate();
		System.out.println("----------------");
		
		Swiggy s = new Swiggy();
		s.orderFood();
		s.pay();
		s.track();
		s.rate();
		s.repeatOrder();
		System.out.println("-------------------");
		
		Swish sw = new Swish();
		sw.orderFood();
		sw.pay();
		sw.track();
		sw.rate();
		System.out.println("-----------------");
		
		Ownly o = new Ownly();
		o.orderFood();
		o.pay();
		o.track();
		o.rate();
	}
}
