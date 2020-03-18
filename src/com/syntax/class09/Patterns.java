package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {

				System.out.print("*");
			}
		}

		// rows are controlled by the outer loop
		// columns are controlled by the inner loop
		for (int i = 1; i <= 10; i++) {
			for (int v = 1; v <= 10; v++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 10; y++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}
