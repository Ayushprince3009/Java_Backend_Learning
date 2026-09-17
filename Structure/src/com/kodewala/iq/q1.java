package com.kodewala.iq;

public class q1 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 0};
		int size = 5;
		int index = 2;
		int element = 99;
		
		for(int i=size-1; i>=index; i--) {
			arr[i+1] = arr[i];
		}
		arr[index] = element;
		size++;
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
