package com.kodewala.iq;

public class q4 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};
		int size = 6;
		int index = 2;
		
		for(int i=index; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
