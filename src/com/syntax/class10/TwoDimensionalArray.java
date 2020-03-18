package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] numbers = new int[3][4];

		// 1st row

		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;

		// 2nd row

		numbers[1][0] = 5;
		numbers[1][1] = 10;
		numbers[1][2] = 15;
		numbers[1][3] = 20;

		// 3rd row

		numbers[2][0] = 1;
		numbers[2][1] = 2;
		numbers[2][2] = 3;
		numbers[2][3] = 4;

		// print value 15

		System.out.println(numbers[1][2]);

		int[][] nums = { { 10, 20, 30, 40 }, { 5, 10, 15, 20 }, { 1, 2, 3, 4 } };
		System.out.println(nums[2][3]);

		// Months pertaining to seasons

		String[][] months = { { "January", "February", "December" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };

		System.out.println(months[2][0]);
		
		int rows=months.length;//how many arrays
		int firstArray= months [0].length;
		System.out.println(firstArray);
		
		
		for (int i=0; i<months.length; i++) {
			
			for (int j=0; j<months[i].length; j++) {		
			
			System.out.println(months[i][j]);
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
}}