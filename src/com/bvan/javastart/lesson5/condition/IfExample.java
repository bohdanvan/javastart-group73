package com.bvan.javastart.lesson5.condition;

/**
 * @author bvanchuhov
 */
public class IfExample {

    public static void main(String[] args) {
        int x = 200;

        if (x < 20) {
            System.out.println("1");
        } else {
            System.out.println("2");
            if (x > 100) {
                System.out.println("4");
            }
        }

        System.out.println("3");
    }
}
