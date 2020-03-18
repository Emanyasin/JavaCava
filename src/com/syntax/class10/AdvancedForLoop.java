package com.syntax.class10;

public class AdvancedForLoop {

	public static void main(String[] args) {
		
		char[] grades = {'A','B','C','D','E','F'};
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		System.out.println();
		System.out.println("---printing using advanced for loop-------");
		for(char grade:grades) {
			System.out.print(grade + " ");
			
			
		}
		//create an array of fruits and retrieve all elements
		
		String[] fruits= {"Banana", "Kiwi", "Apple", "Mango"};
		//if fruit is apple---> that is your favorite fruit
		//advanced for loop, enhanced for loop, for each loop
		
		for(String fruit:fruits) {
			if (fruit.contentEquals("Apple")) {
				System.out.println(fruit+" is my favorite fruit.");
			}
			System.out.println();
			System.out.print(fruit+ " ");
			
			//regular for loop
			for(int i=0; i<fruits.length; i++) {
				System.out.println(fruits[i]);
			}
			
			
			
		}

	}

}
