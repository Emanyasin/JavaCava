package com.syntax.class03;

public class TemperatureCheck {
	
	public static void main(String[] args) {
		
	//Create a Java program and name it Temperature Check. Create variable to store temperature. Your program should check if temperature is below 32 then it should print 
		//“Water will freeze with temperature __“, otherwise “Water will NOT freeze with temperature __“.
		
		int freezeTemp=32;
		int temp1=28;
		
		if(temp1<freezeTemp) {
			
			System.out.println("Water will freeze with temperature "+ temp1);
		}
		
		else {
			System.out.println("Water wil NOT freeze with temperature "+ freezeTemp);
		}
	}

}
