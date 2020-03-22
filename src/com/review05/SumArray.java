package com.review05;

public class SumArray {

	public static void main(String[] args) {
		// TwoDarraySum
		//Iterating 2Darray
		int[][] num = { 
				{ 7, 1, 6, 12 },
				{ 9, 6, 2, 8 },
				{ 3, 0, 8, 5 } 
				};
		
		int rows =  num.length;
		for(int row=0; row<rows; row++) {
			//System.out.println("I am at row index zero " i);
			
		
			for (int column=0; column<num [row].length; column++) {
			int element =	num[row][column];
			System.out.print(element + " ");
				
			}
			System.out.println();
		}
		//SUM of all elements in 2D array
		
		int sum =0;
		//iterating rows
		for(int row=0; row<num.length;row++) {
			int length=num[row].length;
			//iterating elements in a row
		for(int column=0; column<num[row].length; column++) {
			int element = num [row][column];
			sum=sum+element;
			
		}
		}
	
		
		//find the minimum and maximum in the 2D array
		
		
	}int[][] numbers2 = { { 7, 1, 6, 12 },{ 9, 6, 2, 8 },{ 3, 0, 8, 5 } };

}
