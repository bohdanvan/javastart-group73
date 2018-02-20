package com.bvan.javastart.lesson7.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = {10, 20, 30};

        int len = a.length;
        a[2] = 10;
        a[len-1] = 1;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
