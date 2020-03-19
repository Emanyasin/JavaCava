package com.syntac.class13;

public class Q2 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is a prime or not
		//a prime number is a number >1
		//prime numbers should meet two conditions
		//should be divisible by 1 and itself only
		//2,3,5,7,11,13,17...
		//7=1,2,3,4,5,6
		
		int given =6;
		boolean isPrime=true;
		if(given>1) {
			
			for(int i=2; i<given; i++) {
				if (given%i==0) {
					isPrime=false;
					break;
				}
			}
			
		}else {
			isPrime=false;
		}
		System.out.println("given number "+given + " is prime? " + isPrime );
		
		
	}

}
