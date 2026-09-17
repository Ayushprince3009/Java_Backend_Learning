package com.kodewala.fn.inte.pq3;


interface IDiscount{
	int discount(int amt, int dis);
}

public class Driver {
	public static void main(String[] args) {
		IDiscount amount = (price, discount) -> {
			int disc = (price * discount)/100;
			return disc;
		};
		
		int res = amount.discount(1000,15);
		
		System.out.println(res);
		
	}
}
