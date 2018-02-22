package com.bvan.javastart.lesson7.practice;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class AreasCalculator {

    public static void main(String[] args) {
        double[] widths = {10, 30, 1};
        double[] heights = {20, 20};
        double[] areas = rectangleAreas(widths, heights); // {200, 600}
        System.out.println(Arrays.toString(areas));
    }

    public static double[] rectangleAreas(double[] widths,
                                          double[] heights) {

        if (widths.length != heights.length) {
            throw new IllegalArgumentException("different sizes of widths and heights");
        }

        double[] areas = new double[widths.length];
        for (int i = 0; i < areas.length; i++) {
            areas[i] = Geometry.rectangleArea(widths[i], heights[i]);
        }
        return areas;
    }
}
