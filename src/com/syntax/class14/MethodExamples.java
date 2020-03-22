package com.syntax.class14;

public class MethodExamples { 
	
	//want to create a method that will greet a person
	
	void greet() {
		
		System.out.println("Hello Sarmed" );
		
	}
void greet1(String name) {
		
		System.out.println("Hello "+ name );
		
}
		
		
	public static void main(String[] args) {
		//how do I call method greet?--->first we need to create an object of the class where the method belongs
		
		//className variableName=new ClassName();
		MethodExamples object1=new MethodExamples();
		object1.greet1("Sarmed");
		object1.greet1("Eman");
		object1.greet1("Omar");
		object1.greet1("Jenna");
	
	}
	
	
}
