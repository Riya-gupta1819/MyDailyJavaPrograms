package com.riya.local.variable;

public class LocalVariable {
	void show() {
		int n = 10;
		System.out.println(n);
	}

	public static void main(String[] args) {
		LocalVariable obj = new LocalVariable();
		obj.show();

	}

}
