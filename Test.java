package com.riya.cons.basic;

 class Animal{
	String name;
	
	Animal(String name)
	{
		this.name = name;
	}
	
}
 class Cat extends Animal
 {

	public Cat(String name) 
	{
		super(name);
		this.name=name;
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		Animal a = new Animal("cat");
		System.out.println(a.name);
		

	}

}
