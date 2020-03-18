package com.syntax.class07;

public class workDay {

	// Create a boolean variable workDay and assign true create int variable day and
	// assign it to 1
	// As long as it is workDay print “I need a day off” and increase day.
	// Once day is 6 print “I do not need a day off any more”

	public static void main(String[] args) {

		boolean workDay;
		int day = 8;
		while (day < 6) {
			if (day >= 6) {
				System.out.println("I do not need a day off any more");
			}
			System.out.println("I need a day off");
		
		day++;
		}
	
	//2nd way
		boolean workDay1=true;
		int day1=1;
		while(workDay1) {
			if (day1<6) {
				System.out.println("I need a day off");
			}else {
				System.out.println("I do not need a day off");
				workDay1=false;
			}
			day1++;
		}
		//USING LOOP
		//hello five times
		
		int num1=1;
		do {
			System.out.println("Hello");
			num1++;
		}while(num1<=5);
		
	}
	
	

}
