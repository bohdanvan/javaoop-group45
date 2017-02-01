package com.bvan.oop.lessson3.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (Shape shape : shapes) {
            perimeter += shape.getPerimeter();
        }
        return perimeter;
    }

    /**
     * @throws NoSuchElementException
     */
    public Shape biggestByArea() {
        if (shapes.isEmpty()) {
            throw new NoSuchElementException("shapes list is empty");
        }

        Shape res = shapes.get(0);
        double maxArea = res.getArea();
        for (Shape shape : shapes) {
            double area = shape.getArea();

            if (maxArea < area) {
                res = shape;
                maxArea = area;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Shape shape : shapes) {
            joiner.add(shape.toString());
        }
        return "Shapes:\n" + joiner.toString();
    }
}
