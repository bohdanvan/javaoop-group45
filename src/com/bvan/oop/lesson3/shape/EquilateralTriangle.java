package com.bvan.oop.lesson3.shape;

/**
 * @author bvanchuhov
 */
public class EquilateralTriangle implements Shape {

    private final double side;

    /**
     * @throws IllegalArgumentException
     */
    public EquilateralTriangle(double side) {
        checkSide(side);
        this.side = side;
    }

    /**
     * @throws IllegalArgumentException
     */
    private void checkSide(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("negative side: " + side);
        }
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(side, 2) / 4;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "side=" + side +
                '}';
    }
}
