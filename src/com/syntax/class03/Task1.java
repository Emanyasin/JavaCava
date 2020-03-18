package com.syntax.class03;

public class Task1 {

	public static void main(String[] args) {
		
		double numberOne=10;
		double numberTwo=10;
				
		if(numberOne>numberTwo){
				System.out.println("Number one us larger than number 2");
				}else if (numberOne<numberTwo){
				System.out.println("Number one is smaller than number 2");
					
				}else {
				System.out.println("Numbers are equal");
					
				}	

	//declare variable for a day and then based on the value we will provide output
	
	int day=6;
	if(day==1){
				System.out.println("It is Monday, no class today");
	}	else if (day==2) {
		System.out.println("It is Tuesday, we have SDLC Class");
		}else if (day==3) {
			System.out.println("It is Wednesday, we have SDLC Class");
		}else if (day==4) {
			System.out.println("It's Thursday, we have Review class");
		}else if(day==5) {
			System.out.println("It's Friday, no class");
		}else if(day==6) {
			System.out.println("It's Saturday, we have Java Class");
		}else {
			System.out.println("It's Sunday, we have Java Class");
		}
	
}
		
}


