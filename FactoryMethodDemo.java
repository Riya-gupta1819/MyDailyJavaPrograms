package com.riya.factory.method;


// Product interface
interface Shape {
    void draw();
}

// Concrete Products
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

//Factory Class
class ShapeFactory {
 // Factory Method
 public Shape getShape(String shapeType) {
     if (shapeType == null) {
         return null;
     }
     if (shapeType.equalsIgnoreCase("CIRCLE")) {
         return new Circle();
     } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
         return new Rectangle();
     }
     return null;
 }
}


public class FactoryMethodDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();

        // Using factory method to create objects
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw();

	}

}


