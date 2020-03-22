package com.review05;

public class TwoArrayEnhanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][] num = { { 7, 1, 6, 12 },{ 9, 6, 2, 8 },{ 3, 0, 8, 5 } };

	int sum=0;
	for (int[]row : num) {
		for (int element : row) {
			System.out.print(element + " ");
			sum+=element;
		}
		
		System.out.println();
	}
	
	System.out.println(sum);

}}
