package com.syntax.class14;

public class Dog {
	
	
	
	String breed;
	String color;
	int age;
	String name;
	public static void main(String [] args) {
		
	Dog dog1= new Dog();
	dog1.breed="Shih tzu";
	dog1.color="Latte";
	dog1.age=1;
	dog1.name="Pepsi";
	
	dog1.bark();
	dog1.eat();
	dog1.run();

	
	Dog dog2= new Dog();
	dog2.breed="German Shepard";
	dog2.color="Chocolate";
	dog2.age=4;
	dog2.name="Kanan";
	
	dog2.bark();
	dog2.eat();
	dog2.run();


}
	void eat(){
		System.out.println(name +" can eat");
		
	}
	
	void bark () {
		System.out.println(name +" can bark");
	}
	void run() {
		System.out.println(name +" can run");
	}
	
}