package com.bvan.javastart.lesson7.method;

/**
 * @author bvanchuhov
 */
public class SumExample {

    public static void main(String[] args) {
        int x = sum(10, 20);
        int y = sum(x, 40);
        System.out.println(y); // 70
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
