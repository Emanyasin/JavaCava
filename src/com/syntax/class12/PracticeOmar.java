package com.syntax.class12;

public class PracticeOmar {

	public static void main(String[] args) {
// Write a program that sums all numbers that are on even index and on even row.
       //Expected Output  -4
		
		int[][] array = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}	
			};
		
		int k=0;
		
		for (int i=0; i<3; i+=2) {
			for(int x=0; x<4; x+=2) {
				
				 //if (i%2==0 && x%2==0) {
					 k = k+array[i][x];
				// }
					 
				//System.out.print(k+array[i][x] + " ");
			}
			System.out.println();
		}
System.out.println(k);




	}

}
