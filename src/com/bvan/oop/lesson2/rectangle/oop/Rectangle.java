package com.bvan.oop.lesson2.rectangle.oop;

/**
 * Immutable rectangle.
 *
 * @author bvanchuhov
 */
public class Rectangle {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        checkWidth(width);
        checkHeight(height);

        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "rectangle = [" + width + ", " + height + "]";
    }

    public double getWidth() {
        return width;
    }

    public Rectangle changeWidth(double width) {
        return new Rectangle(width, height);
    }

    public double getHeight() {
        return height;
    }

    public Rectangle setHeight(double height) {
        return new Rectangle(width, height);
    }

    private void checkHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("not positive height: " + height);
        }
    }

    private void checkWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("not positive width: " + width);
        }
    }
}
