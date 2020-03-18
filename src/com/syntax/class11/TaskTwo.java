package com.syntax.class11;

public class TaskTwo {

	public static void main(String[] args) {
		// Create an array of countries: north america countries, south america countries, europe countries, asian countries,african countries. 
		//Then print all values from that array using 2 different loops and calculate how many total countries been stored.

		
		
		String [] [] countries = {
				{ "USA", "Mexico", "Canada"},
				{"Argentina","Brazil", "Panama"},
					{"China","North Korea","Japan"},
					{"Tanzania","Kenya", "Egypt"}};
		int total=0;
		for(String[] country:countries){
			for(String state:country) {
				System.out.println(state);
				total++;
			}
		System.out.println();
		
		}
		
		
		for (int r=0; r<countries.length; r++) {
			for (int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c] + " ");
				total++;
			}
			System.out.println();
		}
		
		
		
					}}
				
