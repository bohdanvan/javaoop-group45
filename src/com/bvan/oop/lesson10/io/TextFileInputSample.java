package com.bvan.oop.lesson10.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class TextFileInputSample {

    public static void main(String[] args) {
        try {
            String s = readFromFile("file/hello.txt");
            System.out.println(s);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Sorry, IO error: " + e.getMessage());
        }
    }

    /**
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static String readFromFile(String fileName) throws IOException {
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.readLine();
        }
    }

    /**
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static String oldReadFromFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return reader.readLine();
        } finally {
            closeReader(reader);
        }
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
