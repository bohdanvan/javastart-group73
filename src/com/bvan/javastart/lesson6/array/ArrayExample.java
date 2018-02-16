package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size]; // creation v1
        int[] array2 = {10, 20, 40}; // creation v2

        array[2] = 10; // access by index

        int len = array.length; // length
        System.out.println("len = " + len);

        array[array.length - 1] = 20; // access to last elem
        array[array.length - 2] = 50;

//        array[100] = 5;

//        array[array.length] = 15; // illegal index

        System.out.println(Arrays.toString(array)); // output
    }
}
