package com.bvan.javastart.lesson5.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt();

        System.out.println("I have " + cakes + " cakes.");

        for (int currentCake = 1; currentCake <= cakes; currentCake++) {
            System.out.println("I have eaten " + cakes + " cake.");

            if (currentCake % 2 == 0) {
                System.out.println("Wonderful world.");
            }
        }
    }
}
