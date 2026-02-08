package com.riya.statics.variable;

public class StaticVariable {
	static int roll;
	
	 void show(){
		System.out.println(roll);
	}

	public static void main(String[] args) {
		StaticVariable.roll=1;
//		System.out.println(StaticVariable.roll);
		
		 StaticVariable obj = new  StaticVariable();
		 obj.show();

	}

}
