package com.riya.reverse;

public class Parent {
	int amount = 1000;  // Parent class variable
	}

	class Child extends Parent {
	    int amount = 500;   // Child class variable (shadows parent variable)

	    void showAmount() {
	        System.out.println("Child amount: " + amount);        // 500
	        System.out.println("Child amount using this: " + this.amount);  // 500
	        System.out.println("Parent amount using super: " + super.amount); // 1000
	    }
	}

	public static void main(String[] args) {
		 Child obj = new Child();
	        obj.showAmount();
	}

}
