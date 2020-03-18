package com.syntax.class04;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your city:");
		String city = scan.nextLine();
		System.out.println("Please enter temperature");
		int temp = scan.nextInt();
		
		float degree = (temp-32)/1.8f;
		System.out.println("The temperature in the city "+ city + " is "+ degree+ "C");
		
		

	}

}
