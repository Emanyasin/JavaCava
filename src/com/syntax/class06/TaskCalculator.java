package com.syntax.class06;

import java.util.Scanner;

public class TaskCalculator {
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double n1;
		double n2;
		double answer;

		System.out.println("Enter the first number:");
	
		n1 = scan.nextDouble();

		System.out.println("Enter the second number:");
		 n2 = scan.nextDouble();

		System.out.println("Select the operator:");
		char operator = scan.next().charAt(0);

		if (operator == '+') {
			answer = (n1 + n2);
			System.out.println("Answer: " + answer);
		} else if (operator == '-') {
			answer = (n1 - n2);
			System.out.println("Answer: " + answer);
		} else if (operator == n1 * n2) {
			answer = (n1 * n2);
			System.out.println("Answer: " + answer);
		} else if (operator == '/') {
			answer = (n1 / n2);
			System.out.println("Answer: " + answer);
		} else {
			System.out.println("Sorry, invalid!");

		}

	}

}
