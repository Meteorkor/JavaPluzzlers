package com.meteor.javapluzzlers.q1_q10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q3 {
    @Test
    void wrong() {
        long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;//500654080
        //연산에는 int만 있어서 int로 연산되어 오버플로우

        Assertions.assertEquals(86400000000L, MICROS_PER_DAY);
    }

    @Test
    void answer() {
        long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;

        Assertions.assertEquals(86400000000L, MICROS_PER_DAY);
    }
}
