package com.riya.perfect;

class Counter {

    static int count = 0;   // static variable

    Counter() {
        count++;   // increment when object is created
    }

    void display() {
        System.out.println("Total objects created = " + count);
    }
}

public class Test6 {

	public static void main(String[] args) {
		Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        obj1.display();

	}

}
