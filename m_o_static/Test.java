package com.riya.m_o_static;

public class Test {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(2, 3));        // calls int add(int,int)
        System.out.println(c.add(2.5, 3.5));    // calls double add(double,double)
        System.out.println(c.add(1, 2, 3));     
		

	}

}
