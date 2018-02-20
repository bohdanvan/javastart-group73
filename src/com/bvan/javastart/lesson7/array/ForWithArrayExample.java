package com.bvan.javastart.lesson7.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ForWithArrayExample {

    public static void main(String[] args) {
        int[] a = new int[5];

        // a[0] = 10;
        // a[1] = 20;
        // a[2] = 30;

        // fori
        for (int i = 0; i < a.length; i++) {
            a[i] = 10 * (i + 1);
        }

        System.out.println(Arrays.toString(a));
    }
}
