package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner scan;
		String a = "Yes";
		scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Do you want to apply for a credit card?");
			a = scan.nextLine();
			if (a.equals("Yes")) {
				System.out.println("Stop asking");
				break;
			}

		}
	}
}