package com.bvan.javastart.lesson3.hw;

/**
 * @author bvanchuhov
 */
public class CelsiusToFahrenheitConverter {

    public static void main(String[] args) {
        double celsius = 0; // Input: any valid Celsius temperature

        double fahrenheit = 1.8 * celsius + 32; // Your formula

        System.out.println(celsius + " °C -> " + fahrenheit + " °F");
    }
}

// Test:
// -10.0 °C -> 14.0 °F
// 0.0 °C -> 32.0 °F
