package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		// Write a program to ask a user if there is sale
		// if no sale--->not going shopping
		// if sale we will ask for the price of the item
		// based on the price, we will apply discount and calculate final price
		//
		// if price of the item is less than 20---> apply 10%
		// if price is between 20 and 100--->apply 20%
		// if price is between 100 and 500 ---> apply 30%
		// if price is more than 500---> apply 50%
		// After discount___ the price of the item reduced from____ to____.

		String sale;
		double price;
		double discount=0;
		double finalPrice=0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale?");
		sale = scan.nextLine();
		// equals.ignoreCase applies as well
		if (sale.equals("yes")) {
			System.out.println("I will shop until I drop- what is the price of the item?");
			price = scan.nextDouble();

			if (price <= 20) {
				discount = price * 0.1;

			} else if (price > 20 && price <= 100) {
				discount = price * 0.2;
			} else if (price > 100 && price < 500) {
				discount = price * 0.3;
			} else if (price > 500) {
				discount = price * 0.5;
			}
			finalPrice = price - discount;
			System.out.println(" After discount," + discount + " the price of the item reduced from  " + price + "to $"
					+ finalPrice);

		} else {
			System.out.println("Not going shopping because there is no sale");
		}
	}
}