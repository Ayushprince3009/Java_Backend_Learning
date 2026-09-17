package com.kodewala.dsa.arr.insert.specificvalue;

public class q4 {
	public static void main(String[] args) {
		int[] arr = {5, 10, 15, 20, 25, 30, 0};
		int size = 6;
		int index = 3;
		int element = 100;
		
		for(int i=size-1; i>= index; i--) {
			arr[i+1] = arr[i];
		}
		arr[index] = element;
		size++;
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
