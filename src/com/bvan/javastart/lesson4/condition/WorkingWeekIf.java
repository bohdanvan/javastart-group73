package com.bvan.javastart.lesson4.condition;

/**
 * @author bvanchuhov
 */
public class WorkingWeekIf {

    public static void main(String[] args) {
        int day = 4;

        // BL
        if (day <= 5) {
            System.out.println("Work");

            if (day >= 4) {
                System.out.println("Drink beer");
            }
        } else {
            System.out.println("Friends");
        }

        System.out.println("Java Courses");
    }
}
