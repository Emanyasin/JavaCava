package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {

		String[][] groceries = { { "cucumbers", "potato", "carrot" }, { "mango", "apple", "banana", "kiwi" },
				{ "milk", "cheese", "yogurt" } };
		
		
		
		System.out.println(groceries[1][2]);
		
		//get all values from 2D array
		//loop through rows
		for(int r=0; r<groceries.length; r++) {
			//loop through columns
			for(int c=0; c<groceries.length; c++) {
				
				System.out.print(groceries [r] [c]+ " ");
			}
			System.out.println();
		}
	System.out.println("-----Getting elements using advanced for loops----");
	//loops through all arrays
	for (String[]array:groceries) {
		//loops through each single array
		for(String items:array) {
			System.out.print(items+ " ");
		}
		System.out.println();
	}
	
	
	
	

	}

}
