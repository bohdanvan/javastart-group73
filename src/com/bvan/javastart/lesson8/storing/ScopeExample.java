package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class ScopeExample {

    public static void main(String[] args) {
        int s = 10;
        System.out.println(sum(s, 2));
        System.out.println(s);
    }

    public static int sum(int a, int b) {
        int s = a + b;
        return s;
    }
}
