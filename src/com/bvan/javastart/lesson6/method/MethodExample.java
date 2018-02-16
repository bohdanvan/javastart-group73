package com.bvan.javastart.lesson6.method;


/**
 * @author bvanchuhov
 */
public class MethodExample {

    // Client
    public static void main(String[] args) {
        int x = min(10, 20); // вызов
        int y = min(40, 30);
        int z = x + y;
        System.out.println(z); // 40
    }

    // Creator
    public static int min(int a, int b) { // signature
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    public static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    public static int min(int a) { // with default value
        return min(a, 0);
    }

    // Overloading
    public static double min(double a, double b) {
        double min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
