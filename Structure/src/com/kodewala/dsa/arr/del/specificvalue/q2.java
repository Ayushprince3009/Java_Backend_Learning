package com.kodewala.dsa.arr.del.specificvalue;

public class q2 {
	public static void main(String[] args) {
		int[] arr = {25, 35, 45, 55, 65};
		int size = 5;
		int target = 25;
		
		int index = -1;
		for(int i=0; i<size-1; i++) {
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			for(int i= index; i<size-1; i++) {
				arr[i] = arr[i+1];
			}
			size--;
			
			for(int i=0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
