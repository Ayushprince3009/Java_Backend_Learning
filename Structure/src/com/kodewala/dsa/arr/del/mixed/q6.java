package com.kodewala.dsa.arr.del.mixed;

public class q6 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 0};
		int size = 4;
		int element = 5;
		
		if(size >= arr.length) {
			System.out.println("Array is Full");
		}
		else {
			for(int i=size-1; i>=0; i--) {
				arr[i+1] = arr[i];
			}
			arr[0] = element;
			size++;
			
			for(int i=0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
