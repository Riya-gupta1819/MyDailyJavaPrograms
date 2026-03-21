package com.riya.practice;

class Memo {

    static {
        System.out.println("Static block executed");
    }

    static void show() {
        System.out.println("Static method called");
    }
}

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Main method started");

        Memo.show();   // calling static method (no object)

        System.out.println("Main method ended");

	}

}
