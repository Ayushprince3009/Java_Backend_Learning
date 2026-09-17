package com.kodewala.fn.inte.pq1;

public  class evenChecker {
	public static void main(String[] args) {
		myInterface check = n -> n%2 == 0;
		
		boolean result = check.isEven(50);
		System.out.println(result);
	}	
}


