package com.bvan.javastart.lesson4.io;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class SumIO {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scan.nextInt();

        System.out.print("Enter y: ");
        int y = scan.nextInt();

        int sum = x + y;

        System.out.println("sum = " + sum);
    }
}
