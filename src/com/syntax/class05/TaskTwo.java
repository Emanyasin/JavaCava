package com.syntax.class05;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Please enter your birth month:");
		int month=scan.nextInt();
		String season="Winter";	
		if(month==11 || month==12 || month==1 || month==2) {
			season=("Winter");
		}else if (month==3 || month==4 || month==5){
			season=("Spring");
		}else if (month==6 || month==7 || month==8) {
			season=("Summer");		
		}else if (month==9 || month==10) {
			season=("Fall");
			
		}System.out.println("You were born in the "+ month +" month of the year and in the "+ season);
		
		}

}
