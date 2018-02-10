package com.bvan.javastart.lesson3.type.object_type;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        // <type> <variable-name> = <value>
        int x = 10;
        double d = 2.5;

        // <class> <variable-ref-name> = <object>
        String s = "Java";
        String s1 = new String("Hello");

        int length = s.length();
        System.out.println("length = " + length); // 5

        char c = s.charAt(2);
        System.out.println("c = " + c);

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar);
    }
}
