package com.syntax.class04;

public class NestedIt {

	public static void main(String[] args) {

		boolean classToday = false;
		boolean noClassToday = true;

		if (noClassToday) {

			System.out.println("You can party");

		}if (classToday) {
			System.out.println("Suck it up and go to class");
		} else {
			System.out.println("sleep in");
		}

		System.out.println("I am outside of the if condition");

	}

}
