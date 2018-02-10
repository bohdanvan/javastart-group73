package com.bvan.javastart.lesson2;

/**
 * @author bvanchuhov
 */
public class Overflow {

    public static void main(String[] args) {
        byte x = 127;
        x++;
        System.out.println(x);
    }
}
