package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		// we want to ask user's name and print Good Afternoon____;

		Scanner input;
		String name;
		int num = 1;
		input = new Scanner(System.in);
		while (num <= 5) {

			System.out.println("What is your name");

			name = input.nextLine();

			System.out.println("Good afternoon " + name);
			num++;
		}

		// we are playing a lottery and a lucky number is 17;
		// we want to keep asking user any number from 1 to 20
		// until he guesses the lucky number--->congratulations

		int n = 1;
		Scanner scan = new Scanner(System.in);

		while (n <= 20) {
			System.out.println("Please enter a lucky number between 1 and 20:");
			n++;
			n = scan.nextInt();
			if (n == 17) {
				System.out.println("CONGRATULATIONS");
				break;
			}

			// Another way

			int number;
			int luckyNumber = 17;
			scan = new Scanner(System.in);
			do {
				System.out.println("Please enter any number from 1 to 20");
				number = scan.nextInt();
			} while (number == luckyNumber);

			System.out.println("You got it!!!!");

		}

	}
}
