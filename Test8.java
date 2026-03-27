package com.riya.practice;

class Studentt {

    int id = 101;
    String name = "Riya";

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Test8 {

	public static void main(String[] args) {
		Studentt s1 = new Studentt();   // object creation

        // accessing variables using dot operator
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);

        // calling method using dot operator
        s1.display();

	}

}
