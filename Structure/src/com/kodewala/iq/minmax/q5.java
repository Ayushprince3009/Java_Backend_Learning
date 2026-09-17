package com.kodewala.iq.minmax;

public class q5 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40};

		int[] arr2 = {50, 50, 50, 50};

		int[] arr3 = {10};

		int[] arr4 = {};
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		if(arr1.length < 2) {
			System.out.println("Second Highest does not exist");
		}
		else {
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i] > max) {
					secondMax = max;
					max = arr1[i];
				}
				else if((arr1[i] < max) && (arr1[i]>secondMax)) {
					secondMax = arr1[i];
				}
	
			}
		}
		
		if(secondMax == Integer.MIN_VALUE) {
			System.out.println("Second Highest Element does not found");
		}
		else {
			System.out.println("Second Highest: "+secondMax);
		}
	}
}
