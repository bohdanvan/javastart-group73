package com.bvan.javastart.lesson7.array;

/**
 * @author bvanchuhov
 */
public class ForEachExample {

    public static void main(String[] args) {
        int[] a = {10, 30, 20};

        for (int i = 0; i < a.length; i++) {
            int elem = a[i];
            System.out.println(elem);
        }
        System.out.println();

        for (int elem : a) { // for-each
            System.out.println(elem);
        }
    }
}
