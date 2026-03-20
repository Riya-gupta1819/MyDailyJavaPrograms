package com.riya.practice;

class Demo {

    static {
        System.out.println("Static block executed");
    }

    Demo() {
        System.out.println("Constructor executed");
    }
}

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Main method started");

        Demo obj = new Demo();

        System.out.println("Main method ended");

	}

}
