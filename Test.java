package riya.com.basics_programs;

class Parent {

    Parent() {
        System.out.println("Parent Constructor Called");
    }
}

class Child extends Parent {

    Child() {
        super();   // Calls Parent constructor
        System.out.println("Child Constructor Called");
    }
}

public class Test {
	

	public static void main(String[] args) {
		Child obj = new Child();
	}

}
