package com.kodewala.iq.minmax;

public class q2 {
	public static void main(String[] args) {
		int[] arr = {30, 10, 50, 10, 20, 40, 20, 60};
		int low = arr[0];
		int secondLow = Integer.MAX_VALUE;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < low) {
				secondLow = low;
				low = arr[i];
			}
			else if((arr[i] > low) && (arr[i] < secondLow)) {
				secondLow = arr[i];
			}
		}
		System.out.println("Second Lowest: "+secondLow);
	}
}
