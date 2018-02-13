package com.bvan.javastart.lesson5.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        // 10, 11, ... 20
        for (int n = 10; n <= 20; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 40, 39, ... 30
        for (int n = 40; n >= 30; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 10, 20, ... 100
        for (int n = 10; n <= 100; n += 10) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 1000, 900 ... 100
        for (int n = 1000; n >= 100; n -= 200) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
