package com.kodewala.pattern.printing;

public class pt8HollowTriangle {
	public static void main(String[] args) {
		int n=30;
		for(int row=1; row<=n; row++){
			for(int col=1; col<=row; col++) {
				if(row == n || col == 1) {
					System.out.print("*"+" ");
				}
				else {
					if(row == col) {
						System.out.print("*"+" ");
					}
					else {
						System.out.print(" "+" ");
					}
				}
			}
			System.out.println();
		}
	}
}
