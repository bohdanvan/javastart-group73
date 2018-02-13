package com.bvan.javastart.lesson5.loop;

/**
 * @author bvanchuhov
 */
public class WhileExample {

    public static void main(String[] args) {
        int n = 10; // (1) - init counter

        while (n >= 20) { // (2) - loop condition
            System.out.println(n);
            n++; // (3) - counter changing
        }
        System.out.println("Goodbye");
    }
}
