package com.meteor.javapluzzlers.q1_q10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Q7 {
    @Test
    void wrong() {
        //swap
        int x = 1984;//0x7c0
        int y = 2001;//0x7d1

        x ^= y ^= x ^= y;
        log.info("x : {}, y: {}", x, y);
        Assertions.assertEquals(1984, y);
        Assertions.assertEquals(2001, x);//wrong
    }

    @Test
    void answer1() {
        int x = 1984;//0x7c0
        int y = 2001;//0x7d1

        int tmp = x;
        x = y;
        y = tmp;
        Assertions.assertEquals(1984, y);
        Assertions.assertEquals(2001, x);
    }

    @Test
    void answer2() {
        int x = 1984;//0x7c0
        int y = 2001;//0x7d1

        //임시 변수 필요없는 swap, 하지만 사용하지 말자.
        // 하나의 표현식에서 한 번 이상 동일한 변수에 할당하지 말자
        x = x ^ y;
        y = y ^ x;
        x = y ^ x;
        Assertions.assertEquals(1984, y);
        Assertions.assertEquals(2001, x);
    }

}
