package com.bvan.javastart.lesson7.hw;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayHW {

    public static void main(String[] args) {
        // 1
        boolean[] a = new boolean[30];

        // 2
        double[] b = {10.2, 5.6, 7.8, 11.9};

        int[] c = new int[10];

        // 3
        int length = c.length;

        // 4
        String s = Arrays.toString(c);

        // 5
        Arrays.fill(c, 42);

        // 6
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        // 7
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 0) {
                System.out.println(i);
            }
        }

        // 8
        for (int elem : c) {
            if (elem > 0) {
                System.out.println(elem);
            }
        }

        // 9
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] > 0) {
                System.out.println(c[i]);
            }
        }
    }
}
