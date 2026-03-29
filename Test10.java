package com.riya.practice;

class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class ShapeFactory {

    static Shape getShape(String type) {

        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        else {
            return null;   // no matching type
        }
    }
}
public class Test10 {

	public static void main(String[] args) {
		Shape s1 = ShapeFactory.getShape("circle");
        if (s1 != null)
            s1.draw();

        Shape s2 = ShapeFactory.getShape("triangle");
        if (s2 != null)
            s2.draw();
        else
            System.out.println("No matching shape found");

	}

}
