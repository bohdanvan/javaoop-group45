package com.bvan.oop.lessson3.shape;

/**
 * @author bvanchuhov
 */
public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        checkWidth(width);
        checkHeight(height);

        this.width = width;
        this.height = height;
    }

    private void checkHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("negative height: " + height);
        }
    }

    private void checkWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("negative width: " + width);
        }
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
