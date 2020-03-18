package com.syntax.class08;

public class Break {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				System.out.println("I am stopping the loop");
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");

		for (int y = 1; y <= 10; y++) {
			if (y == 4) {
				System.out.println("I am skipping iteration");
				continue;

			}
			System.out.println("I am inside the loop");
			System.out.println(y);
		}
		// write a program that prints numbers from, 1- 20
		// I do not want to print numbers 5, 6, & 7
		for (int i = 1; i < 21; i++) {
			if (i == 5 || i == 6 || i == 7) {
				continue;

			}
			System.out.println(i);
		}
	}

}