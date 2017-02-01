package com.bvan.oop.lessson3.shape.client;

import com.bvan.oop.lessson3.shape.Rectangle;
import com.bvan.oop.lessson3.shape.Shape;

/**
 * @author bvanchuhov
 */
public class PolymorphismSample {

    public static void main(String[] args) {
        Shape shape = new Rectangle(10.0, 20.0);
        System.out.println("P = " + shape.getPerimeter());
    }
}
