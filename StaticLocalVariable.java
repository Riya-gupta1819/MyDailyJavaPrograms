package com.riya.local.variable;

public class StaticLocalVariable {
	
	static void college() {
		int roll = 1;
		String name = "riya";
		System.out.println("Name is:"+name+" Roll : "+roll);
	}

	public static void main(String[] args) {
		StaticLocalVariable.college();

	}

}
