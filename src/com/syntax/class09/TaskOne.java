package com.syntax.class09;

public class TaskOne {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F.
		//Then print a grade B (use 2 different ways of creating an array).
		
		char[] charArray = {'A','B','C','D','E','F'};
		
		String str =new String(charArray);
		System.out.println(str);
		//getting all elements
		
		for (int i=0; i<charArray.length; i++) {
			System.out.println(charArray[i]);
		}
	
		//Create an array of names and store all names of your group.
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		//First Way
		
		String[] freedomWriter=new String[8];
		freedomWriter[0]="Eman";
		freedomWriter[1]="Mo";
		freedomWriter[2]="Rana";
		freedomWriter[3]="Tareq";
		freedomWriter[4]="Sabah";
		freedomWriter[5]="Sameh";
		freedomWriter[6]="Abe";
		freedomWriter[7]="Omar";
		System.out.println(freedomWriter [0]);
		
		//Second Way
		
		String [] freedomWriters= {"Eman" , "Mohamed", "Rana", "Omar", "Tareq", "Sabah", "Abe", "Sameh"};
		System.out.println(freedomWriters [0]);
		
		//Create an array of words: Java, Saturday, day, coding, is.
		//Print the following sentence using elements of array: “Saturday is Java coding Day”.
		
		

		String [] code= {"Java" , "Saturday", "day", "coding", "is"};
		
		
		System.out.println(code[1]+ " "+ code[4]+ " " + code[0]+ " "+ code[3]+" "+ code[2]+".");
		
		
		
		
		
	}

}
