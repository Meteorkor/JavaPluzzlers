package com.meteor.javapluzzlers.q31_q40;

import org.junit.jupiter.api.Test;

public class Q34 {

    @Test
    void wrong() {
        final int START = 2_000_000_000;
        int count = 0;
        for (float f = START; f < START + 50; f++) {
            count++;
        }
        System.out.println(count);//0
    }

    @Test
    void answer() {
        final int START = 2_000_000_000;
        int count = 0;

        for (int f = START; f < START + 50; f++) {//float -> int or double
            count++;
        }
        System.out.println(count);//0
        //교훈, 부동소수 인덱스를 사용하지 마라
        //사용해야한다면 float보다는 doubleㅇ르 사용하라

    }

}
