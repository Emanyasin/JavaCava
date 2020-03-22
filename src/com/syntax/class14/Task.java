package com.syntax.class14;

import java.util.Scanner;

public class Task {
	
	//Create a Class “Phone”. Create 3 Objects of it:
		//iPhone, Android, Nokia with specific  attributes and behaviors.
		String brand;
		String color;
		String model;
		public static void main(String[] args) {
			Task iphone=new Task();
			iphone.brand="Iphone";
			iphone.color="White";
			iphone.model="X Max";
			iphone.dial();
			iphone.text();
			iphone.pics();
			Task samsung=new Task();
			samsung.brand="Samsung";
			samsung.color="Black";
			samsung.model="Note10";
			samsung.dial();
			samsung.text();
			samsung.pics();
			Task nokia=new Task();
			nokia.brand="Nokia";
			nokia.color="Gray";
			nokia.model="Nokia 9";
			nokia.dial();
			nokia.text();
			nokia.pics();
			
			String str="Hello friends";
			str.replace("Hello", "Welcome");
			System.out.println(str);
			//Scanner scan=new scanner(System.in);
			//scan.hasNextLine();
		}
		void dial() {
			System.out.println(brand+" can dial");
		}
		void text() {
			System.out.println(brand+" can text");
		}
		void pics() {
			System.out.println(brand+" can take a picture");
		}
}
