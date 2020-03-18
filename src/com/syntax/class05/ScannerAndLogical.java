package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {

		// You are a salesman
		// Ask a user for his sales
		// Based on the amount of sales we need to calculate commission
		// if sales are between 1-100---> commission should be 10%
		// if sales are between 100 and 200--> commission should be 20%
		// if sales are between 200 and 500--> commision should be 30%
		// if sales are more than 500---> commission should be 50%

		Scanner scan;
		double sales;
		double commission;

		scan = new Scanner(System.in);
		System.out.println("Please enter your sales amount:");
		sales = scan.nextDouble();

		if (sales > 1 && sales <= 100) {
			// give user 10% commission
		
			commission = sales * 0.10;

		} else if (sales > 100 && sales <= 200) {
			commission = sales * 0.20;

		} else if (sales > 200 && sales <= 500) {
			commission = sales * 0.30;

		} else {
			commission = sales * 0.50;
		}
			System.out.println("Based on your sales, your commission is "+ commission);
	
		if (commission>100) {
			System.out.println(" You are an awesome seller");
		}
	}
	}
//