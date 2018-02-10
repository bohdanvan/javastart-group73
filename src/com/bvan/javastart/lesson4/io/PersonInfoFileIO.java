package com.bvan.javastart.lesson4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInfoFileIO {

    public static void main(String[] args) throws FileNotFoundException {
        // Input
        // 1. Create new Scanner object
        // 2. Read name and age with the scanner object
        // 3. Close the scanner (if external resource, e.g file)

        File file = new File("person.txt");
        Scanner scan = new Scanner(file);

        String name = scan.next();
        int age = scan.nextInt();

        scan.close();

        // BL
        String message = "I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
