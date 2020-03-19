package com.syntac.class13;

public class Q1 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers w/o a temporary variable? swap 2
		// strings w/o a temporary variable?

		int a = 10;
		int b = 20;

		a = a + b; // 30
		b = a - b; // 30-20=10
		a = a - b; //

		System.out.println("The value of = " + a);
		System.out.println("The value of = " + b);

		String str1 = "Day";
		String str2 = "Night";
		
		str1= str1+str2;//DayNight
		str2=str1.substring(0,str1.length()- str2.length()); //Day
		str1=str1.substring(str2.length());//Night
		
		System.out.println("The value of str1= " +str1);
				System.out.println("The value of str2 = "+ str2);
				
			

				
				
	}

}
