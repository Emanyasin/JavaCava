package com.syntax.class11;

public class MorExamples {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = "Hello";

		if (str1.contentEquals(str2)) {
			System.out.println("Strings are equal");

		} else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-----Comparing using===operator----");

		if (str1 == str2) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		 if(str1==str3) {
	            System.out.println("Str1 is equal to Str3");
	        }else {
	            System.out.println("Str1 is NOT equal to Str3");
		}
	}

}
