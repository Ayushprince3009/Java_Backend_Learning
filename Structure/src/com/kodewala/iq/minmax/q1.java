package com.kodewala.iq.minmax;

public class q1 {
	public static void main(String[] args) {
		int[] arr = {45, 12, 89, 89, 34, 76, 12, 67};
		int max = arr[0];
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			else if((arr[i] < max) && (arr[i]> secondMax)) {
				secondMax = arr[i];
			}
		}
		System.out.println("Second Max: "+secondMax);

	}
}
