package com.syntax.class12;

public class StringManipulationMore {

	public static void main(String[] args) {
	
		System.out.println("---substring() FUNCTION----");
		//to get substring from a given string
		//substring =String inside your String
		
		String str="Today is a rainy day";
		String partialString= str.substring(6);
		System.out.println(partialString);
		
		//Rainy day
		
		partialString=str.substring(11);
		System.out.println(partialString);
		
		//Today
		
		str.substring(0,5);
		
		//Rainy
		
		partialString=str.substring(11,16);
		System.out.println(partialString);
		
	}

}
