package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		// Take age input from a user and based on the age printout
		// If age is from 0-3--> you are a baby
		// If age is from 4-5--> you are a kid
		// If age is from 6-12--> you are a child
		// If age is from 13-19--> you are a teenager
		// If age is from 20-64--> you are an adult
		// If age is more or equal to 65--> you are a senior
		// First step- declare all variables
		// Scanner scan- ctrl+shift+o

		Scanner scan = new Scanner(System.in);

		System.out.println(" Please enter your age");
		int age = scan.nextInt();
		if (age>0) {
			
		if (age<3) {
			
			System.out.println("You are a baby");
		}else if (age>=4 && age<=5) {
			System.out.println("You are a kid");
		}else if(age>=6 && age<=12) {
			System.out.println("You are a child");
		}else if (age>=13 && age<=19) {
			System.out.println("You are a teenager");
		}else if (age>=20 && age<=64) {
			System.out.println("You are an adult");
		}else{
			System.out.println("You are a senior");
		
		}}else {
			System.out.println("Please enter valid age");
		
		}
	
	}}


