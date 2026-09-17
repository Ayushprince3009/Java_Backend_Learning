package com.kodewala.arrays;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 56, 8, 34, 9, 15 };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
				
			}if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum Element:- "+max);
		
		System.out.println("Minimum Element:- "+min);
	}

}
