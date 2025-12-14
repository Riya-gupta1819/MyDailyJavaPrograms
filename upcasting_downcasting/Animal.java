package com.riya.upcasting_downcasting;

public class Animal {
	void makeSound() {
		System.out.println("Animal is make sound here");
		
	}
}
	
	class Dog extends Animal{
		void makeSound() {
			System.out.println("Dog is bark");
			
		}
	}
	
	class Cat extends Animal{
		void makeSound() {
			System.out.println("Cat is meow");
			
		}
	}


