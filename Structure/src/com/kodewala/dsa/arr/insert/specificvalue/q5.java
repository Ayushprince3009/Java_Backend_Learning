package com.kodewala.dsa.arr.insert.specificvalue;

public class q5 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 0};
		int size = 5;
		int index = 7;
		int element = 99;
		
		if((index < 0) || (index > size)) {
			System.out.println("Invalid Size");
		}
		else {
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
}
