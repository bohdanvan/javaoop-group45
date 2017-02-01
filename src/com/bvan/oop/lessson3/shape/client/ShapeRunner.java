package com.bvan.oop.lessson3.shape.client;

import com.bvan.oop.lessson3.shape.Circle;
import com.bvan.oop.lessson3.shape.EquilateralTriangle;
import com.bvan.oop.lessson3.shape.Rectangle;
import com.bvan.oop.lessson3.shape.Shape;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        printInfo(new Rectangle(10.0, 20.0));
        printInfo(new Circle(10.));
        printInfo(new EquilateralTriangle(10.0));
    }

    private static void printInfo(Shape shape) {
        System.out.println(shape);
        System.out.println("P = " + shape.getPerimeter());
        System.out.println("S = " + shape.getArea());
        System.out.println();
    }
}
