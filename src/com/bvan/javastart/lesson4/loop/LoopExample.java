package com.bvan.javastart.lesson4.loop;

/**
 * @author bvanchuhov
 */
public class LoopExample {

    public static void main(String[] args) {
        // 30...40
        for (int n = 30; n <= 40; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 80, 79 ... 70
        for (int n = 80; n >= 70; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 200, 300, 400, ... 1000
        for (int n = 200; n <= 1000 ; n += 100) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
