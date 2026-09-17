package com.kodewala.fn.inte.pq1;

public class Driver {
	public static void main(String[] args) {
		discountInterface amount = (amnt, per) -> {
			int amountGst = (amnt * per ) / 100;
			return amountGst;
		};
		//int result = amount.gstAmount(1000,12);
		//System.out.println(result);
	}
	
	
}
