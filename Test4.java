package com.riya.practice;

class Demo {

    static {
        System.out.println("Static Block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    static {
        System.out.println("Static Block 3");
    }
}

public class Test4 {

	public static void main(String[] args) {
		System.out.println("Main method");

        Demo obj = new Demo();   // object create


	}

}
