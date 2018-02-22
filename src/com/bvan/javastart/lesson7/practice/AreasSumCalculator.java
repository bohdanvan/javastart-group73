package com.bvan.javastart.lesson7.practice;

/**
 * @author bvanchuhov
 */
public class AreasSumCalculator {

    public static void main(String[] args) {
        double res = circleAreasSum(new double[]{10, 20});
        System.out.println(res); // 1570.7963267948967
    }

    public static double circleAreasSum(double[] radiuses) {
        double res = 0;
        for (double radius : radiuses) {
            res += Geometry.circleArea(radius);
        }
        return res;
    }

}
