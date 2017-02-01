package com.bvan.oop.lessson3.rectangle;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class Rectangles {

    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double getArea() {
        double area = 0.0;
        for (Rectangle rectangle : rectangles) {
            area += rectangle.getArea();
        }
        return area;
    }

    public Rectangles findByPerimeter(double minPerimeter, double maxPerimeter) {
        Rectangles result = new Rectangles();

        for (Rectangle rectangle : rectangles) {
            double perimeter = rectangle.getPerimeter();

            if (perimeter > minPerimeter && perimeter < maxPerimeter) {
                result.addRectangle(rectangle);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Rectangle rectangle : rectangles) {
            joiner.add(rectangle.toString());
        }
        return "Rectangles:\n" + joiner.toString();
    }
}
