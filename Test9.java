package com.riya.reverse;


class Demo {

    static int staticVar = 0;   // static variable
    int instanceVar = 0;        // instance variable

    void increment() {
        staticVar++;
        instanceVar++;

        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println();
    }
}

public class Test9 {

	public static void main(String[] args) {
		 Demo obj1 = new Demo();
	        Demo obj2 = new Demo();

	        obj1.increment();
	        obj2.increment();

	}

}
