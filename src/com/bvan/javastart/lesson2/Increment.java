package com.bvan.javastart.lesson2;

/**
 * @author bvanchuhov
 */
public class Increment {

    public static void main(String[] args) {
        int n = 10;

        System.out.println("n = " + (n++));
        System.out.println(n);

        int x = 0;
        x += x++ + ++x;
    }
}
