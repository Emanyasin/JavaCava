package com.syntax.class03;

public class AdditionVsConvatenation {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
				
		String x="Hello";
		String y="Bye";
		
		//ctrl+space--->autocomplete -syso
		
		System.out.println(a+b+x+y);//30HelloBye
		System.out.println(a+x+b+y);//10Hello20Bye
		System.out.println(x+y+a+b);//HelloBye30 or HelloBye1020
		System.out.println(x+y+(a+b));
		//1020HelloBye
		
	System.out.println(a+""+b+x+y);
		
				
	
	}
}
