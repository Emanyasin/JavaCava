package com.syntax.class04;

public class NestedItContinues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check if patient has any allergies
		//if no allergied --> you are healthy
		//otherwise check if patient has:
		//orange allergy---> do not eat oranges
		//apple allergy--->do not eat apples
		//kiwi allergy---->do not eat kiwis
		
		boolean allergy=true;
		boolean appleAllergy=true;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;
		
		if (allergy) {	
			System.out.println("Please indicate allergy below");
		
			if (orangeAllergy) {
				System.out.println("You are allergic to oranges, do not eat oranges");
				if(appleAllergy) {
					System.out.println("You are allergic to apples, do not eat apples");
					if (kiwiAllergy) {
						System.out.println("You are allergic to kiwis, do not eat kiwis");
					}
				}
			}
		 }else {
			System.out.println("You are healthy");
    	}

}}
