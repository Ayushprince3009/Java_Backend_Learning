package com.kodewala.dsa.arr.insert.specificvalue;

public class q3 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 0};
		int size = 4;
		int index = 4;
		int element = 50;
		
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
