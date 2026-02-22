package com.riya.cons.basic;

public class Student {
	
	int rollNo;
    String name;
    double marks;

    // Default constructor
    Student() {
        this(101);   // calling parameterized constructor
        System.out.println("Default Constructor Called");
    }

    // Constructor with one parameter
    Student(int rollNo) {
        this(rollNo, "Riya");  // calling another constructor
        System.out.println("One-Parameter Constructor Called");
    }

    // Constructor with two parameters
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = 85.5;
        System.out.println("Two-Parameter Constructor Called");
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

	public static void main(String[] args) {
		  Student s = new Student();
	        s.display();
	}

}
