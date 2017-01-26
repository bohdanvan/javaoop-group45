package com.bvan.oop.lesson2.rectangle.oop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RectangleIOSample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = readSize(scanner, "width");
        double height = readSize(scanner, "height");

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle);
    }

    private static double readSize(Scanner scanner, String fieldName) { // Procedural code of reading
        System.out.print("Enter " + fieldName + ": ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Not a double");
            System.exit(0);
        }
        double width = scanner.nextDouble();

        if (width <= 0) {
            System.out.println("Illegal " + fieldName);
            System.exit(0);
        }

        return width;
    }
}
