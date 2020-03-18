package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		// capture name from a user and print in the format
		// my name is-------
		//1.Bring scanner class into a program
		//System.in---> identifies keyboard

		System.out.println("Please enter your name");
		//capture line in strings from user
		String name = scan.nextLine();
		//capture text-line of strings from user
		System.out.println("My name is " + name);
		//Instruct user of what program expects
		System.out.println("How old are you?");
		//capture number from a user
		int age=scan.nextInt();
		//capture the number
		System.out.println("Your name is " +name + " and my age is"+" " +age);
		
	}

}
