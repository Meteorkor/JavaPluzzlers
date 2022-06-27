package com.meteor.javapluzzlers.q1_q10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q6 {
    @Test
    void wrong() {
        final int i = (int) (char) (byte) -1;
        //32bit -> 8bit -> 16bit -> 32bit
        //TODO more
        Assertions.assertEquals(65535, i);
    }
}
