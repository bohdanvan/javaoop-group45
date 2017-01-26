package com.bvan.oop.lesson2.rectangle.proc;

/**
 * @author bvanchuhov
 */
public class ProcRectangleRunner {

    public static void main(String[] args) {
        ProcRectangle rectangle = new ProcRectangle();
        rectangle.width = 10.0;
        rectangle.height = 20.0;

        System.out.println(ProcRectangle.rectangleInfo(rectangle));
        System.out.println("area = " + ProcRectangle.area(rectangle));
        System.out.println("perim = " + ProcRectangle.perimeter(rectangle));
    }
}
