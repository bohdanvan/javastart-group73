package com.bvan.javastart.lesson6.method;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        printTriangle(-1);
    }

    public static void printTriangle(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        for (int line = 1; line <= size; line++) {
            printLine(line);
        }
    }

    public static void printLine(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("negative count: " + count);
        }

        for (int n = 1; n <= count; n++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
