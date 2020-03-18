package com.syntax.class08;

public class ForLoop {

	public static void main(String[] args) {
		//used when you know how many times you want to repeat the block of code
//write a program to calculate sum of odd and sum of even numbers 
	//1-99
		int sumEven= 0;
		int sumOdd = 0;
		for(int even=1; even<=99; even++) {
			if (even%2==0) {
				sumEven = sumEven + even;
				
				
			}else {sumOdd=sumOdd+even;
			}
			System.out.println(sumEven);
					System.out.println(sumOdd);
					
		}
		
			}
}