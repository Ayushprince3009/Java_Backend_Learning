package com.kodewala.iq.minmax;

public class q3 {
	public static void main(String[] args) {
		int[] arr = {45, 12, 89, 34, 7, 56, 91, 23};
		int max = arr[0];
		int secondMax = Integer.MIN_VALUE;
		int min = arr[0];
		int secondMin = Integer.MAX_VALUE;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			else if((arr[i] < max) && (arr[i] > secondMax)){
				secondMax = arr[i];
			}
			
			if(arr[i] < min) {
				secondMin = min;
				min = arr[i];
			}
			else {
				if((arr[i] > min) && (arr[i] < secondMin)) {
					secondMin = arr[i];
				}
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Second Max: "+secondMax);
		System.out.println("Min: "+min);
		System.out.println("Second Min: "+secondMin);
	}
}
