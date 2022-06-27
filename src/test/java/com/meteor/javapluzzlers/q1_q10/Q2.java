package com.meteor.javapluzzlers.q1_q10;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q2 {
    @Test
    void wrong() {
        double val = 2.00 - 1.10;//0.8999999999999999

        Assertions.assertEquals(0.90, val);
    }

    @Test
    void answer1() {
        int val = 200 - 110;

        Assertions.assertEquals(90, val);
    }

    @Test
    void answer2() {
        double val = BigDecimal.valueOf(2.00).subtract(BigDecimal.valueOf(1.10)).doubleValue();

        Assertions.assertEquals(0.90, val);
    }
}
