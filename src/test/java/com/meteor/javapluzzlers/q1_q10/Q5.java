package com.meteor.javapluzzlers.q1_q10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q5 {
    @Test
    void wrong() {
        String val = Long.toHexString(0x100000000L + 0xcafebabe);
        //혼합 계산 타입, long + int

        Assertions.assertEquals("cafebabe", val);//ok
    }

    @Test
    void answer() {
        String val = Long.toHexString(0x100000000L + 0xcafebabeL);

        Assertions.assertEquals("1cafebabe", val);//ok
    }
}
