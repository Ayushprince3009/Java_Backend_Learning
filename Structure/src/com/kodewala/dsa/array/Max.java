package com.kodewala.dsa.array;

public class Max {
	public static void main(String[] args) {
		int[] data = {10,20,30,90,45,12,6,40,50,1,9};
		
		int max = Integer.MIN_VALUE;
		int index = 0;
		for(int i=0; i<data.length; i++) {
			if(data[i] > max) {
				max = data[i];
				index = i;
			}
		}
		System.out.println("Maximum element is "+max+" at index "+index+".");
	}
}
