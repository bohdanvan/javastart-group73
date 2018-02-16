package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class YearsArray {

    public static void main(String[] args) {
        int[] years = new int[19];

        for (int i = 0; i < years.length; i++) {
            years[i] = 2000 + i;
        }

        for (int year : years) {
            System.out.println(year * 10);
        }

        System.out.println(Arrays.toString(years));
    }
}
