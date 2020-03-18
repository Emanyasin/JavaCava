package com.syntax.class04;

public class MoreNestedIt {
	
	public static void main (String[] args) {
		
		//declare date and a day
		//if day is Friday--> if date is 13--- watch horror movie
		//                 -->if date is not 13---> watch a comedy movie
		
		
		boolean isFriday=true;
		int date=14;
		
		if(isFriday) {
			System.out.println("Today is Friday, I am going to the movies");
			
			if(date==13) {
				System.out.println("I will watch a horror movie!");
			}else {
				
				System.out.println("I will watch a comedy movie");
			}
			
		}else {
			System.out.println("Today is not Friday, I am staying home");
		}
	}

}
