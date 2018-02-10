package com.bvan.javastart.lesson4.io;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInfoIO {

    public static void main(String[] args) {
        // Input
        // 1. Create new Scanner object
        // 2. Read name and age with the scanner object
        // 3. Close the scanner (if external resource, e.g file)

        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        int age = scan.nextInt(2);

        scan.close();

        // BL
        String message = "I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
