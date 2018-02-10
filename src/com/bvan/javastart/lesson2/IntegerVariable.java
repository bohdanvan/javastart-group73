package com.bvan.javastart.lesson2;

/**
 * @author bvanchuhov
 */
public class IntegerVariable {

    public static void main(String[] args) {
        int age = 25;

        age = age + 10; // 35
        age += 10; // 45

        age = age + 1;
        age += 1;
        age++; // increment
        ++age;

        age--; // decrement
        --age;

        System.out.println(age); // 47
    }
}
