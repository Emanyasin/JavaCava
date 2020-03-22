package com.review05;

public class TwoDarrayDemo {

	public static void main(String[] args) {
		// 1st way
		// This basically states there are 3 rows and each row there are 4 elements
		int[][] numbers = new int[3][4];

		// Let's print third element in second row

		System.out.println(numbers[1][2]);

		// Let us initialize values for first row=index zero

		numbers[1][0] = 7;
		numbers[1][1] = 1;
		numbers[1][2] = 6;
		numbers[1][3] = 12;

		// Let us initialize values for first row=index 1

		numbers[1][0] = 9;
		numbers[1][1] = 6;
		numbers[1][2] = 2;
		numbers[1][3] = 8;

		System.out.println("The third element in second row is: " + numbers[1][2]);

		// Let us initialize values for first row=index 2

		numbers[2][0] = 3;
		numbers[2][1] = 0;
		numbers[2][2] = 8;
		numbers[2][3] = 5;

		// 2nd way

		int[][] numbers2 = { { 7, 1, 6, 12 },{ 9, 6, 2, 8 },{ 3, 0, 8, 5 } };
		//Let's print 4th element in first row
		System.out.println(numbers2[0][3]);
		int row=numbers2.length;
		System.out.println("rows = " + row);
		int length0= numbers[0].length;
		int length1= numbers[1].length;
		int length2= numbers[2].length;
		System.out.println("row0="+ length0 +": row1="+ length1 + " row2="+ length2);
		
		
		
		
		

	}

}
