package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		//NOT(!)- REVERSE THE CONDITION
		boolean b=!true;
		boolean val=!false;
		
		System.out.println("b");
		System.out.println("val");
		
		boolean isCold=true;
		if (!isCold) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
			
		
		String day1="Tuesday";
	
			
			//if it not Monday or Friday-->find me at syntax
			
			if (!day1.contentEquals("Monday") && !day1.contentEquals("Friday")) {
				System.out.println("Find me at Syntax");
			}	
			if (!(day1.contentEquals("Monday") && day1.contentEquals("Friday"))) {
				System.out.println("Find me at Syntax");
		
	}	
}
}