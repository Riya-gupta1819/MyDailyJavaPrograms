package com.riya.staticc;

public class Test {
	
	int x = 0;
	static int y = 1;
	
	void display() {
		System.out.println("Static "+y);
		System.out.println("Instant "+x);
	}

	public static void main(String[] args) {
		Test d1 = new Test();
		d1.display();
		
		Test d2 = new Test();
		d2.display();
		
		Test d3 = new Test();
		d3.display();

	}

}
