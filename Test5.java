package com.riya.practice;

class Student {

    int id;
    String name;

    void setData(int id, String name) {
        this.id = id;       // current object ka id
        this.name = name;   // current object ka name
    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }
}

public class Test5 {

	public static void main(String[] args) {
		 Student s1 = new Student();
	        s1.setData(101, "Riya");

	        s1.display();
	}

}
