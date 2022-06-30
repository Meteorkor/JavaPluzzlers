package com.meteor.javapluzzlers.q31_q40;

import org.junit.jupiter.api.Test;

public class Q35 {

    @Test
    void wrong() {
        int minutes = 0;
        for (int ms = 0; ms < 60 * 60 * 1000; ms++) {
            if (ms % 60 * 1000 == 0) {
                minutes++;
            }
        }
        System.out.println(minutes);//60_000
    }

    @Test
    void answer() {
        int minutes = 0;
        // 모든 마법의 숫자를 적절히 이름붙인 상수를 이용하여 표현하자.
        final int MS_PER_HOUR = 60 * 60 * 1000;
        final int MS_PER_MINUTE = 60 * 1000;
        for (int ms = 0; ms < MS_PER_HOUR; ms++) {
            if (ms % MS_PER_MINUTE == 0) {
                minutes++;
            }
        }
        System.out.println(minutes);//60_000
        //그룹을 사용하기 위해 공백을 사용하기보다, 괄호를 사용하라
    }

}
