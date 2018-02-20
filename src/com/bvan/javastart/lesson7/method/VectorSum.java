package com.bvan.javastart.lesson7.method;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class VectorSum {

    public static void main(String[] args) {
        // [10, 20, 30]
        // [40, 20, 50, 100]

        // [50, 40, 80]

        int[] x = {10, 20, 30};
        int[] y = {40, 20, 50, 100};

        int[] vectorSum = vectorSum(x, y);
        System.out.println(Arrays.toString(vectorSum));
    }

    public static int[] vectorSum(int[] a, int[] b) {
        int len = Math.min(a.length, b.length);
        int[] res = new int[len];

        for (int i = 0; i < res.length; i++) {
            res[i] = a[i] + b[i];
        }

        return res;
    }
}
