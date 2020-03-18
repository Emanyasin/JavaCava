package com.syntax.class05;

public class MoreLogical02 {

	public static void main(String[] args) {
		
	//Just like Morelogical exercise but with strings
		//to compare two strings use "equals"

		String day1= "Thursday";
		
		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("Today is SDLC Class");
			
		}else if (day1.equals("Saturday") || day1.equals("Sunday")) {
				System.out.println("Today is Java Class");
			}else if (day1.equals("Monday") && day1.equals("Friday")) {
				System.out.println("We are off!");
			}else if (day1.equals("Thursday")){
				System.out.println("We have review");
			}else {
				System.out.println("Invalid day");
			}
	}
}
