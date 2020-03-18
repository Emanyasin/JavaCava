package com.syntax.class04;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		
	Scanner	scan= new Scanner(System.in);

	String text=scan.nextLine();
	
	System.out.println("text");
	
	scan.hasNextInt();
	System.out.println("number");
	
	System.out.println("End of Program");
	}

}
