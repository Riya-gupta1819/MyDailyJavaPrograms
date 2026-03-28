package com.riya.practice;

class Demoo {

    int x;
    int y;

    // Non-static block
    {
        x = 10;
        y = 20;
        System.out.println("Non-static block executed");
    }

    // Constructor
    Demo() {
        System.out.println("Constructor executed");
    }

    void display() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

public class Test9 {

	public static void main(String[] args) {
		 Demoo obj = new Demoo();  // object creation
	        obj.display();

	}

}
