package com.syntax.class11;

public class StringValidations {

	public static void main(String[] args) {
		
		String message= "Welcom Admin!";
		
		//Verify that the message contains username which is Admin
		
		
		System.out.println(message.contains("Admin"));
		boolean flag=message.contains("welcome");
		System.out.println(flag);
		
		//we want to see if welcome starts with welcome
		
		System.out.println("-----starts with() FUNCTION----");
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		
		//we want to verify that welcome message ends with username
		System.out.println("-------endsWith() FUNCTION ----");
		String username="Admin";
		
		boolean ends=message.endsWith(username);
		System.out.println(ends);
	}

}
