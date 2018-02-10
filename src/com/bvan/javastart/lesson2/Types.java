package com.bvan.javastart.lesson2;

/**
 * @author bvanchuhov
 */
public class Types {

    public static void main(String[] args) {
        // Primitives

        // Integer
        byte b = 100; // 1 B, [-128...127]
        short s = 10000; // 2 B [~ -32000 ... ~ +32000]
        int x = 1000000000; // 4 B (default), max = ~ 2 000 000 000
        long l = 1000000000000000000L; // 8 B

        // Floating point types
        float f = 10.5f; // 4 B
        double d = 10.5; // 8 B (default)

        // Character
        char c = 'a'; // 2 B, UNICODE

        // Logic
        boolean bool = true;

        // Object types
        String str = "Hello";
    }
}
