package com.bvan.javastart.lesson7.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ScannerReadLineExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        System.out.println(n);
        System.out.println(line);
    }
}

// 10
// 20 30
