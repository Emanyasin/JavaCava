package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		//ask a user to pay for candy
		//as long as the entered price is not 2
		//we need to keep asking the user to pay
		//one amount is correct---->"Enjoy your candy"

		Scanner s;
		double price;
		//while loops only loops if condition is true
		s=new Scanner(System.in);
		do {
			
		System.out.println("Please pay for candy");
		price=s.nextDouble();
		}while (price!=2);
		System.out.println("Enjoy your candy");
	}

}
