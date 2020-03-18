package com.syntax.class11;

public class StringPractice {

	public static void main(String[] args) {
		
		String str1="Welcome Syntax students";
		String str2= "Welcome Syntax Students";
		
		//to compare 2 strings
		System.out.println("---equals() equalsIgnoreCase() FUNCTION----");
		
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected= "Home - Syntax Technologies";
		
		String actual= "Home - Syntax Technologies";
		
		if (actual.contentEquals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fails. Titles are NOT MATCHED");
		}
		
		System.out.println("-----first trim and then compare----");
		
		
		if (actual.trim().contentEquals(expected)){
			
		}else {
			System.out.println("Test case fails. Titles are not matched");
		}
		
		String browser="Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
		//OR
		
		if (browser.toLowerCase().contentEquals("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
		
		
		
		
	}

}
