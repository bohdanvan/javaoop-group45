package com.bvan.oop.lesson2.rectangle.oop;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);

        System.out.println(rectangle.toString());
        System.out.println("area = " + rectangle.getArea());
        System.out.println("perimeter = " + rectangle.getPerimeter());
    }
}
