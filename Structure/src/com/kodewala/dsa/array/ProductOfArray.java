package com.kodewala.dsa.array;

public class ProductOfArray {
	public static void main(String[] args) {
		int[] arr = {2,6,4,9,1};
		
		productArray(arr);
	}
	
	public static void productArray(int[] arr) {
		int res = 1;
		for(int i=0; i<arr.length; i++) {
			res *= arr[i];
		}
		System.out.println("Product of Array:-"+res);
	}
}
