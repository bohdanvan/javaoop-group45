package com.bvan.oop.lesson3.shape.client;

import com.bvan.oop.lesson3.shape.Circle;

/**
 * @author bvanchuhov
 */
public class CircleRunner {

    public static void main(String[] args) {
        Circle circle = new Circle(10.0);

        System.out.println(circle);
        System.out.println("P = " + circle.getPerimeter()); // ~62
        System.out.println("S = " + circle.getArea()); // ~314
    }
}
