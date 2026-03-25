package com.riya.practice;

class Student1 {

    void study() {
        System.out.println("Student is studying");
    }

    void play() {
        System.out.println("Student is playing");
    }
}

public class Test6 {

	public static void main(String[] args) {
		Student1 s1 = new Student1();   // object creation using new

        s1.study();   // method call
        s1.play();    // method call

	}

}
