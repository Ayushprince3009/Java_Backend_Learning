package com.kodewala.dsa.arr.del.mixed;

public class q10 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 0};
		int size = 4;
		int element = 50;
		
		if(size > arr.length) {
			System.out.println("Invalid");
		}
		else if(size == arr.length) {
			System.out.println("Array is full");
		}
		else {
			arr[size] = element;
			size++;
			
			for(int i=0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
