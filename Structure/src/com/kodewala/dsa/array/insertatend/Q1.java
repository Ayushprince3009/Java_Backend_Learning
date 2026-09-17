/*Array:
[10][20][30][40][50][0][0][0]

Capacity = 8
Current Size = 5*/

package com.kodewala.dsa.array.insertatend;

public class Q1 {
public static void main(String[] args) {
	int[] arr = new int[8];
	int[] data = {10,20,30,40,50};
	int size = data.length;
	System.out.println(size);	
	
	for(int i=0; i<size; i++) {
		arr[i] = data[i];
	}
	
	arr[size] = 60;
	size++;
	arr[size] = 70;
	size++;
	
	for(int i=0; i<size; i++) {
		System.out.println("Element at Index "+i+" "+arr[i]);
	}
}
}
