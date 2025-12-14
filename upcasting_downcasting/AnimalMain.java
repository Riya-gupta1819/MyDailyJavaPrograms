package com.riya.upcasting_downcasting;

public class AnimalMain {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.makeSound();
		
		a = new Dog();
		a.makeSound();
		
		a = new Cat();
		a.makeSound();
		

	}

}
