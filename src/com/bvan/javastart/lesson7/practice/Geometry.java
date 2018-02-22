package com.bvan.javastart.lesson7.practice;

/**
 * @author bvanchuhov
 */
public class Geometry {

    public static void main(String[] args) {
        double a1 = rectangleArea(10, 20); // Client
        double a2 = rectangleArea(30, 20);

        double a3 = circleArea(-10);
        double a4 = circleArea(20);

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a4 = " + a4);
    }

    /**
     * Calculates area of the rectangle.
     * @param width a width of the rectangle.
     * @param height a height of the rectangle.
     * @return the area.
     */
    public static double rectangleArea(double width,
                                       double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("not positive width: " + width);
        }
        if (height <= 0) {
            throw new IllegalArgumentException("not positive height: " + height);
        }

        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("not positive radius: " + radius);
        }

        return Math.PI * Math.pow(radius, 2);
    }
}
