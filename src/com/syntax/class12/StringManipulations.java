package com.syntax.class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		//Using charAt FUNCTION
		
		String str="Good Morning Students!";
		
		char letter1 = str.charAt(0);
		System.out.println(letter1);

		char letter5 = str.charAt(4);
		System.out.println("Letter at index 4 is " + letter5+ " . " );
		
	
		//get all characters 1 by 1 from the string?
		
		char letter;
		
		for (int i=0; i<str.length(); i++) {
			letter=str.charAt(i);
			System.out.print(letter + " ");
		}
		System.out.println();
		
		//Using INDEX OF
		
		String name ="Syntax Technologies";
		int index = name.indexOf("y");
		System.out.println(index);
		
		index=name.indexOf(" ");
		System.out.println(index);
		
		index=name.indexOf("Syntax");
		System.out.println(index);
		
		
		index=name.indexOf("!");
		System.out.println(index);
		
		index=name.indexOf("Technologies");
		System.out.println("Index of substring Technologies=" +index);
		
	}

}
