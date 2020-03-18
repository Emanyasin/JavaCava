package com.syntax.class03;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		
		double d=10;
		System.out.println(d);//10.0
		
		//int i=10.99; -----> compile time error saying: type mismatch, cannot convert double to int
		//casting- converting one type into another type --primitive/non primitive -two types of casting
		
		
		int i=(int) 10.99; //we can only fit 10
		//byte-128-127
		
	
		byte b=(byte)128;
		
		System.out.println(b);
		
	}

}
