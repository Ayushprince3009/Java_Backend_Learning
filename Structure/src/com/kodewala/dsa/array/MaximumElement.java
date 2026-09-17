package com.kodewala.dsa.array;

public class MaximumElement {

	public static void main(String[] args) {
		int[] arr = {1,9,23,78,45,2,12,15,21};
		
		int max = Integer.MIN_VALUE;
		int index=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("Maximum Value:- "+max);
		System.out.println("Index of Maximum Element is:- "+index);
	}

}
