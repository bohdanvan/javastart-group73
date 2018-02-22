package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class Comparing {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println("ref: " + (s1 == s2));
        System.out.println("content: " + s1.equals(s2));
    }
}
