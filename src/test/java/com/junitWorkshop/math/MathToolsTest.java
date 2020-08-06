package com.junitWorkshop.math;

import java.lang.IllegalArgumentException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathToolsTest {
    @Test
    void testConvertToDecimalSuccess() {
        double result = MathTools.convertToDecimal(3, 4);
        Assertions.assertEquals(0.75, result);
    }

    @Test
    void testConvertToDecimalInvalidDenominator() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathTools.convertToDecimal(3, 0));
    }
}
