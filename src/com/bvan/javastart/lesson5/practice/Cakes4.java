package com.bvan.javastart.lesson5.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt();

        System.out.print("Enter border cake: ");
        int borderCake = scanner.nextInt();

        System.out.println("I have " + cakes + " cakes.");

        for (int currentCake = 1; currentCake <= cakes; currentCake++) {
            System.out.println("I have eaten " + currentCake + " cake.");

            if (currentCake > borderCake) {
                System.out.println("I'm feeling bad.");
            }
        }
    }
}
