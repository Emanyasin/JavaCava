package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		String card=scan.nextLine();
		
		if (card.equals("yes")) {
		
		System.out.println("What is the balance on the card?");	
			int num=scan.nextInt();		
	if (num>1000){
		System.out.println("Pay card balance immediately");
	}else {
			System.out.println("Spend more");
	}
	}else {
		
			System.out.println("Would you like to apply for a credit card?");
	
	}
	
	}		
}
