package com.kodewala.reverse.array;

public class q3 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int k = 3;
		
		int i = 0;
		
		while(i < arr.length) {
			int j = Math.min(i+k-1,  arr.length-1);
			int start = i;
			while(i<=j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			i = start + k;	
		}
		for(int m=0; m<arr.length; m++) {
			System.out.print(arr[m]+" ");
		}
	}
}
