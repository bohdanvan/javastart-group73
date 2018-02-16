package com.bvan.javastart.lesson6.array;

/**
 * @author bvanchuhov
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] array = {10, 30, 20};

//        int sum = 0;
//        sum += array[0];
//        sum += array[1];
//        sum += array[2];

//        int sum = 0;
//        for (int i = 0; i < array.length; i++) { // fori
//            int elem = array[i];
//            sum += elem;
//        }

        // for-each
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }

        System.out.println("sum = " + sum);
    }
}
