package com.kodewala.dsa.arr.del.ins;

public class q2 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 0};
		int size = 5;
		int target = 30;
		int ele = 99;
		int pos = 1;
		int index = -1;
		
		for(int i=0;i<size; i++) {
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			for(int i=index; i<size; i++) {
				arr[i] = arr[i+1];
			}
			size--;
			
			for(int i=0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		for(int i=size-1;i>=pos; i--) {
			arr[i+1] = arr[i];
		}
		arr[pos] = ele;
		size++;
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
