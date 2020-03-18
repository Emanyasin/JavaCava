package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {

		// ask a user where he or she is from
		// based on the country we will define favorite food
		// Your favorite food is ___

		Scanner scan;
		String country;
		String favoriteFood;

		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();
//lowerCase or UpperCase (all must be uppercase)
		switch (country.toLowerCase()) {

		case "morocco":
			favoriteFood = "Couscous";
			break;
		case "belarus":
			favoriteFood = "Potato";
		case "tajikstan":
			favoriteFood = "Osh";
			break;
		case "afghanistan":
			favoriteFood = "Mantu";
			break;
		case "kazakhstan":
			favoriteFood = "Beshparmak";
			break;
		default:
			favoriteFood = "unknown";
		}
		System.out.println(" Your favorite food is " + favoriteFood);
	}

}
