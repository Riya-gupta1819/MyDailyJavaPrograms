package com.riya.tostring;

public class Student {
	
	 int id;
	    String name;
	    double marks;

	    // Constructor
	    Student(int id, String name, double marks) {
	        this.id = id;
	        this.name = name;
	        this.marks = marks;
	    }

	    // Overriding toString()
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
	    }

	public static void main(String[] args) {
		 Student s1 = new Student(101, "Riya", 85.5);
	        Student s2 = new Student(102, "Aman", 90.0);

	        // Printing objects directly
	        System.out.println(s1);
	        System.out.println(s2);
	}

}
