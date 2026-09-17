package com.kodewala.iq.minmax;

public class q4 {
	public static void main(String[] args) {
		int[] arr = {-50, -10, -30, -10, -20, -40};
		int max = arr[0];
		int secondMax = Integer.MIN_VALUE;
		for(int i =1; i<arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			else if((arr[i] < max) && (arr[i]>secondMax)) {
				secondMax = arr[i];
			}
		}
		System.out.println("Second Highest: "+secondMax);
	}
}
