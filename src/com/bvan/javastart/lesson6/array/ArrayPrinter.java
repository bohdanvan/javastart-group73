package com.bvan.javastart.lesson6.array;

/**
 * @author bvanchuhov
 */
public class ArrayPrinter {

    public static void main(String[] args) {
        int[] array = {10, 30, 20};

        for (int elem : array) {
            System.out.println(elem * 10);
        }
    }
}
