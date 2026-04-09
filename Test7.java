package com.riya.perfect;

class Domo {

    static int count = 10;   // static variable

    void show() {
        System.out.println("Count = " + count);
    }
}

public class Test7 {

	public static void main(String[] args) {
		 Domo obj1 = new Domo();
	        Domo obj2 = new Domo();

	        // initial values
	        obj1.show();
	        obj2.show();

	        System.out.println("---- After Modification ----");

	        // modify using obj1
	        obj1.count = 50;

	        // check values again
	        obj1.show();
	        obj2.show();

	}

}
