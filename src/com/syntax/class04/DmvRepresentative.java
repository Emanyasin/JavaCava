package com.syntax.class04;

import java.util.Scanner;

public class DmvRepresentative {
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please enter your age");
	
	int age=scan.nextInt();
	if (age>=18) {
		System.out.println("You are eligible to recieve a Driver's License");
		
	}else if (age<=17) {
		System.out.println("You are eligible to recieve a Learning Permit");
		
	}

}}
