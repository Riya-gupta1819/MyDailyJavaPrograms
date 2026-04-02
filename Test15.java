package com.riya.practice;


class Demo1 {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}


public class Test15 {

	public static void main(String[] args) {

        Demo obj = new Demo();

        obj = null;   // object eligible for GC

        System.gc();  // request for garbage collection

        System.out.println("End of main method");

	}

}
