package com.syntax.class06;

import java.util.Scanner;

public class TaskCountryLanguages {

	public static void main(String[] args) {
	
		Scanner scan;
		String country;
		String language = null;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country) {

		case "Palestine":
			language= "Arabic";
			break;
		case "Afrghanistan":
			language = "Farsi";
			break;
		case "Spain":
			language = "Spanish";
			break;
		default:
			language= "Invalid";
	}
System.out.println("Your language is " + language);
}
}