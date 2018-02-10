package com.bvan.javastart.lesson3.type.double_type;

/**
 * @author bvanchuhov
 */
public class MoneyStoring {

    public static void main(String[] args) {
        long money = 277700639;

        double moneyForOutput = (double) money / 10000000;
        System.out.println(moneyForOutput);

        // BigDecimal
    }
}
