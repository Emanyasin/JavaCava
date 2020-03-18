package com.syntax.class05;

public class MoreLogical {

	public static void main(String[] args) {

		// We have a total of 7 days a week
		// If day is 2 or 3 --> SDLC
		// If day 6,7--> Java Class
		// If day 4 --> review class

		int day = 6;

		if (day == 2 || day == 3) {
			
			System.out.println("Today is SDLC Class");
		}else if(day==6 || day==7) {
			System.out.println("Today is JAVA class");
		}else if (day==1 || day==5) {
			System.out.println("Today is no class, it is day off");
		}else if(day==4) {
			System.out.println(" Today is a review class with Elion");
		}else {
			System.out.println(" Invalid day");
		}}
}
