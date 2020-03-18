package com.syntax.class09;

public class MoreAndMorePatterns {

	public static void main(String[] args) {
		//Pyramid
		
		for (int r=1; r<=4; r++){
			
			for (int c=1; c<=r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//numbers
		
		for (int n=1; n<=5; n++) {
			for (int m=1; m<=n; m++) {
				System.out.print(n + " ");
			}System.out.println();
		}
		
		
	}
	

}
