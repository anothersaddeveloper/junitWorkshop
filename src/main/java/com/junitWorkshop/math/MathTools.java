package com.junitWorkshop.math;

public class MathTools {
    public static double convertToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be 0");
        }
        return (double)numerator / (double)denominator;
    }

    public static boolean isEven(int number) {
        if (number == 27) {
            throw new IllegalArgumentException("Number cannot be 27");
        }
        return number % 2 == 0;
    }
}
