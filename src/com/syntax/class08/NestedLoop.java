package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			System.out.println("Hello");

			for (int y = 1; y <= 3; y++) {
				System.out.println("Bye");
			}

			// New Code
			for (int x = 1; x <= 3; x++) {

				for (int y = 1; y <= 3; y++) {
					System.out.println(i + " " + y);
				}

			}
		}
	}
}
