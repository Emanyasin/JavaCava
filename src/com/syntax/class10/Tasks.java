package com.syntax.class10;

public class Tasks {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it.
		//Using 2 different loops print all elements from the array.

		String [] animals={ "dogs","cats","birds","hamsters", "mice", "rats"};
		System.out.println(animals[0]+" "+ animals[1]+" "+ animals[2]+" " +animals[3]+ " " +animals[4]+ " " +animals[5]);
		
		for (int a=0; a<animals.length; a++) {
			System.out.println(animals[a]);
		}
		
		//Task 2
		//Create an array on integers and calculate the sum of all integer elements in an array.
		
		int [] numbers= { 100,200,300,400};
		int sum = numbers[0]+numbers[1]+numbers[2]+numbers[3];
		System.out.println(sum);
		//Another way
		//int sum=0;
		//for(int i :numbers){
		//sum+=i;
		
		//Task 3
		//Create an array of countries. 
		//While retrieving all values from an array print capital for each country. (use 2 different loops).
		
		
		String [] countries= { "Palestine", "Jordan", "Lebanon", "Syria", "Kuwait"};
		
		for(String country:countries) {
			if (country.contentEquals("Palestine")) {
				System.out.println("Jerusalem is the capital.");
			}else if (country.contentEquals("Jordan")){
				System.out.println("Amman is the capital.");
			}else if (country.contentEquals("Lebanon")){
				System.out.println("Beirut is the capital.");
			}else if (country.contentEquals("Syria")){
				System.out.println("Damascus is the capital.");
			}else if (country.contentEquals("Kuwait")){
				System.out.println("Kuwait City is the capital.");
				System.out.println();
}}
	//Second Way
		
		for(int y=0; y<countries.length; y++) {
			switch(countries[y]) {
			case "Palestine":
				System.out.println("Jerusalem");
				break;
			case "Jordan":
				System.out.println("Amman");
				break;
			case "Lebanon":
				System.out.println("Beirut");
				break;
			case "Syria":
				System.out.println("Damasacus");
				break;
			case "Kuwait":
				System.out.println("Kuwait City");
				break;
			}
		}
	
	
	}}