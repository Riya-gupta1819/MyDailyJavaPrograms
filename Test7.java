package com.riya.practice;

class Animal {
}

class Dog extends Animal {
}

public class Test7 {

	public static void main(String[] args) {
		 Dog d = new Dog();

	        if (d instanceof Dog) {
	            System.out.println("d is instance of Dog");
	        }

	        if (d instanceof Animal) {
	            System.out.println("d is instance of Animal");
	        }

	}

}
