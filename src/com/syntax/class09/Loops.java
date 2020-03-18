package com.syntax.class09;

public class Loops {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println("---------------------");
		// using nested loop, print from 10 to 99
		for (int i = 1; i <= 9; i++) {
			for (int y = 0; y <= 9; y++) {
				System.out.println(i + "" + y);
			}
		}
		System.out.println("--------------------");
		//using nested loop, 24 hour clock
		for(int i=0; i<=23; i++) {
		}
	}
}
		
		
	
