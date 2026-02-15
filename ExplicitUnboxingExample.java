package com.riya.type.casting;

public class ExplicitUnboxingExample {

	public static void main(String[] args) {
Integer obj = Integer.valueOf(50);  // wrapper object
        
        int a = obj.intValue();  // explicit unboxing

        System.out.println("Wrapper object: " + obj);
        System.out.println("Primitive value: " + a);

	}

}
