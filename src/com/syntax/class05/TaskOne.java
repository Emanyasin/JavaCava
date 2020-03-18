package com.syntax.class05;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		

	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter youur quiz score:");
	int quiz=scan.nextInt();

	System.out.println("Please enter your midterm score:");
	int midterm=scan.nextInt();
	
	System.out.println("Please enter your final score:");
	int finalGrade=scan.nextInt();
	
	int average=(quiz+midterm+finalGrade)/3;
	String grade=scan.nextLine();
	

	if (average >= 90) {
	  grade = ("A");
	

	} else if (average>=70 && average<90) {
		grade = ("B");

	} else if (average>=50 && average<70) {
		grade= ("C");
	
	} else if (average<50);
		grade= ("F");
	
		System.out.println("Your average score is " + average + "and your grade is " + grade);


}
}