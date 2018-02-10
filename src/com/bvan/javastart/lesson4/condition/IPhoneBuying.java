package com.bvan.javastart.lesson4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IPhoneBuying {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter money: ");
        long money = scanner.nextLong();

        System.out.print("Are you happy? (yes/no): ");
        boolean isHappy = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Does girlfriend want? (yes/no): ");
        boolean girlfriendWants = scanner.next().equalsIgnoreCase("yes");

        long iPhonePrice = 999;

        // BL + Output
        if ((!isHappy || girlfriendWants) && money >= iPhonePrice) {
            System.out.println("Buy");
            money -= iPhonePrice;
        } else {
            System.out.println("Sadly :(");
        }
        System.out.println("Money left " + money);
    }
}
