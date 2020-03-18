package com.syntax.class11;

public class TwoDarray {

	public static void main(String[] args) {
		// lets create 2D array in which we store professions

		String[][] professions = { { "QA Tester", "Developer", "Product Owner", "Scrum Master", },
				{ "Math Teacher", "Science Teacher", "ESL Teacher" }, { "Dentist", "Surgeon" } };

		// get elements using advanced for loop

		for (String[] occupation : professions) {
			for (String occ : occupation) {
				System.out.print(occ + " ");
			}
			System.out.println();
		}
	}}
