package com.riya.perfect;

class Dem {

    // Static block
    static {
        System.out.println("Static Block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    // Non-static block
    {
        System.out.println("Non-Static Block 1");
    }

    {
        System.out.println("Non-Static Block 2");
    }

    // Constructor
    Dem() {
        System.out.println("Constructor executed");
    }

    // Method
    void display() {
        System.out.println("Method executed");
    }
}

public class Test5 {

	public static void main(String[] args) {
		 System.out.println("Main method started");

	        Dem obj1 = new Dem();   // first object
	        obj1.display();

	        System.out.println("-----");

	        Dem obj2 = new Dem();   // second object
	        obj2.display();

	        System.out.println("Main method ended");
	}

}
