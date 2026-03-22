package com.riya.practice;

class Parent {

    static {
        System.out.println("Parent static block");
    }
}

class Child extends Parent {

    static {
        System.out.println("Child static block");
    }
}

public class Test3 {

	public static void main(String[] args) {
		 System.out.println("Main method");

	        Child obj = new Child();  

	    }

	}


