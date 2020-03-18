package com.syntax.class06;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {

		// Write a program to find largest number among three numbers using
		// nested if provided by a user (numbers must be distinct)

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int largest;
		
		if (num1 >= num2) {
			if (num1 > num3) {
				largest = num1;
			} else {
				largest = num3;
			}
		}else {
			if(num2>num3) {
				largest=num2;
			}else {
				largest=num3;
				
				System.out.println(" largest number is "+ largest);
				
				
				
				
			}
		}

	}
}
