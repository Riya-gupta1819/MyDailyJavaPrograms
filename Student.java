package com.riya.reverse;

public class Student {
	 String name;   // Instance variable

	    // Constructor with same parameter name
	    Student(String name) {
	        this.name = name;   // 'this.name' refers to instance variable
	    }

	    void display() {
	        System.out.println("Student Name: " + name);
	    }


	public static void main(String[] args) {
		Student s1 = new Student("Riya");
        s1.display();

	}

}
