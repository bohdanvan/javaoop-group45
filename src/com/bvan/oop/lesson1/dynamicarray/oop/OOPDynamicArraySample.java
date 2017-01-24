package com.bvan.oop.lesson1.dynamicarray.oop;

public class OOPDynamicArraySample {

    public static void main(String[] args) {
        DynamicArray elems = readClientElemsFromConsole();
        System.out.println(elems.toString());
    }

    private static DynamicArray readClientElemsFromConsole() {
        ConsoleScanner consoleScanner = new ConsoleScanner();
        DynamicArray elems = new DynamicArray();

        int n = consoleScanner.readInt();
        while (n != 0) {
            elems.addLast(n);
            n = consoleScanner.readInt();
        }
        return elems;
    }
}
