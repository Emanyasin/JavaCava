package com.syntax.class06;

import java.util.Scanner;

public class TaskCalculator02 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		double n1;
		double n2;
		
		System.out.println("Please enter first number: ");
		n1=scan.nextDouble();
		
		System.out.println("Please enter second number: ");
		n2=scan.nextDouble();
		
		System.out.println("Please choose operator: ");
		char operator = scan.next().charAt(0);
		
		double answer;
		
		switch (operator) {
		
		case '+':
			answer=n1+n2;
			break;
		case '-':
			answer=n1-n2;
			break;
		case '*':
			answer=n1*n2;
			break;
		case '/':
			answer=n1/n2;
			break;
		default:
		System.out.println("Invalid Entry");
		return;
		
		}
		System.out.println(n1 +" " +operator + " "+ n2 + " equals " + answer);
		
		
	
		
		
		
	}
	}


