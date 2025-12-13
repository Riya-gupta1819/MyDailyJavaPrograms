package com.riya.over;

public class Parent {
	void show() {
		System.out.println("parent method");
	}

}

class Child extends Parent{
	void show() {
		System.out.println("child method");
	}
	
	int show (int a, int b) {
		return a+b;
	}
}
