package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point),
				//provided by a user and then from that range prints the sum of the even and odd integers.
		
		
		
		Scanner scan;
		int sumodd = 0;
		int sumeven = 0;
		scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int min = scan.nextInt();
		int max = scan.nextInt();
		for (int i = min; i <= max; i++) {
			if (i % 2 == 0) {
				sumeven = sumeven + i;
			} else {
				sumodd = sumodd + i;
			}
		}
		System.out.println("Total of even numbers between" + min+ " " + sumeven);
		
		System.out.println("Total of even numbers between ” +min+” to " + max+ " " + sumodd);
	}
}