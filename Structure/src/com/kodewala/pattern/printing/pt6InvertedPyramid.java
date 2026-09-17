package com.kodewala.pattern.printing;

public class pt6InvertedPyramid {

	public static void main(String[] args) {
		int n=4;
		for(int row=1; row<=n; row++) {
			//int space=0;
			for(int col=1; col<=(row-1); col++) {
				System.out.print(" "+" ");
				//space++;
			}
			for(int star=1; star<=((2*n-row)-(row-1)); star++){
			//for(int star=1; star<=((2*n-row)-space); star++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
