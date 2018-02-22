package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class NullReference {

    public static void main(String[] args) {
        String s1 = null;
        String s2 = "";

        System.out.println(s2.length());

        if (s1 != null) {
            System.out.println(s1.length());
        } else {
            System.out.println("Sorry, NULL");
        }
    }
}
