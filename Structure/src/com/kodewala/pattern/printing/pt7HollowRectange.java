package com.kodewala.pattern.printing;

public class pt7HollowRectange {

	public static void main(String[] args) {
		int n=40;
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=20; col++) {
				if(row==1 || row==40 || col==1 || col==20 ) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
