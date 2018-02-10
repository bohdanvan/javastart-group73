package com.bvan.javastart.lesson2;

/**
 * @author bvanchuhov
 */
public class PersonInfo {

    public static void main(String[] args) {
        String firstName = "Ivan";
        int age = 30;

        firstName = firstName + "123"; // Ivan123
        age = age - 10; // 20

        // -----------

        System.out.println("Hello, my name is " + firstName);
        System.out.println("I'm " + age + " years old");
    }
}
