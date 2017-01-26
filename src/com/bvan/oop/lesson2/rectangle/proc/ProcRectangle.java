package com.bvan.oop.lesson2.rectangle.proc;

/**
 * @author bvanchuhov
 */
public class ProcRectangle { // VERY BAD CLASS (DO NOT DO THIS): class contains fields of an object and pure procedures

    // fields

    double width;
    double height;

    // pure procedures

    public static String rectangleInfo(ProcRectangle rectangle) {
        return "rectangle = [" + rectangle.width + ", " + rectangle.height + "]";
    }

    public static double area(ProcRectangle rectangle) {
        return rectangle.width * rectangle.height;
    }

    public static double perimeter(ProcRectangle rectangle) {
        return 2 * (rectangle.width + rectangle.height);
    }
}
