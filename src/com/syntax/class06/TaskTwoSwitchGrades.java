package com.syntax.class06;

import java.util.Scanner;

public class TaskTwoSwitchGrades {

	public static void main(String[] args) {
		Scanner scan;
		String explanation;
		char grade;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade:");
		grade=scan.next().charAt(0);
		
		switch(grade) {
		
		case 'A':
			explanation= "excellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
			break;
		default:
			explanation= "invalid";
		}
			System.out.println(" Your grade is " + grade + " and your performance is " + explanation);
			
		

	}

}
