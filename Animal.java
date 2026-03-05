package com.riya.reverse;

public class Animal {
	
	 String name = "Animal";

	    void sound() {
	        System.out.println("Animal makes sound");
	    }
	}

	class Dog extends Animal {

	    String name = "Dog";

	    void sound() {
	        System.out.println("Dog barks");
	    }

	    void show() {
	        System.out.println("Child name: " + name);          // child variable
	        System.out.println("Parent name: " + super.name);   // parent variable

	        super.sound();   // parent method
	        sound();         // child method
	    }
	}

	public static void main(String[] args) {
		 Dog obj = new Dog();
	        obj.show();
	}

}
