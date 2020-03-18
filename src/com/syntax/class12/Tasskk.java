package com.syntax.class12;

public class Tasskk {

	public static void main(String[] args) {
	
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		

		String str2="I hate";
		String str3="my";
		String str4="life!";
		
		str2=str2.trim().concat(str3).concat(str4);	
		System.out.println(str2);
		
		//OR
		
		String sen="My name is Eman";
		sen=sen.replaceAll(" ", "");
		System.out.println(sen);
		

		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		
		String str11="GoDaddyYoMamma123*^^%%#278672";
		str11=str11.replaceAll("[0-9]", "A");
		System.out.println(str11);


		//You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?

		
		
		
		
	}}
