package com.syntax.class09;

public class TaskPattern {

	public static void main(String[] args) {
		//Print the following pattern:
			//55555
			//4444
			//333
			//22
		//	1 

		for (int x=5; x>=1; x--){
			for (int y=1; y<=x; y++) {
				System.out.print(x);
			}System.out.println();
		}
		
		for ( int t=1; t<=5; t++) {
			for (int s=1; s<=t; s++) {
				System.out.print("*");
			}System.out.println();
				
				
			}
		}
			
	}
