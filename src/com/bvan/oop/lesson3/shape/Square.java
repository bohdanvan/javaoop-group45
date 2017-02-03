package com.bvan.oop.lesson3.shape;

import sun.security.provider.SHA;

/**
 * @author bvanchuhov
 */
public class Square implements Shape {

    private final Rectangle rectangle;

    public Square(double side) {
        this.rectangle = new Rectangle(side, side);
    }

    @Override
    public double getPerimeter() {
        return rectangle.getPerimeter();
    }

    @Override
    public double getArea() {
        return rectangle.getArea();
    }

    public double getSide() {
        return rectangle.getWidth();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                '}';
    }
}
