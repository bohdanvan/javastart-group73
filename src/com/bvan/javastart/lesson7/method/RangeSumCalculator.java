package com.bvan.javastart.lesson7.method;

/**
 * @author bvanchuhov
 */
public class RangeSumCalculator {

    public static void main(String[] args) {
        int res = rangeSum(100, 5);
        System.out.println(res);
    }

    public static int rangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from > to");
        }

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }

}
