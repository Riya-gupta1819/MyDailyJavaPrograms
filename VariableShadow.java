package com.riya.variable.shadow;

public class VariableShadow {
	
	int x = 10;
	
	void m1() {
		int x = 20;
		System.out.println("Instance "+x);
		System.out.println("Local "+this.x);
	}

	public static void main(String[] args) {
		VariableShadow obj = new VariableShadow();
		obj.m1();

	}

}
