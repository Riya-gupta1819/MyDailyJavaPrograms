package com.riya.over;

public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		p.show();
		
		Child c = new Child();
		System.out.println(c.show(2, 3));

	}

}
