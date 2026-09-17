package com.kodewala.dsa.arr.del.mixed;

public class q3 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 40, 50, 0};
		int size = 4;
		int index = 2;
		int element = 30;
		
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
