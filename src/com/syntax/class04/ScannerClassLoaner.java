package com.syntax.class04;

import java.util.Scanner;

public class ScannerClassLoaner {
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println ("Please enter the loan amount you need");
		
		int num1=input.nextInt();
		
		System.out.println(num1);
		
		if (num1<=200000) {
			System.out.println("You are approved to receive the loan");
			
		}else {
			System.out.println("you are rejected");
		}
	
	
	}
	
}
