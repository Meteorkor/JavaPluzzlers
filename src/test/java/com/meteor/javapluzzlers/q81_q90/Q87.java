package com.meteor.javapluzzlers.q81_q90;

import org.junit.jupiter.api.Test;

public class Q87 {

    @Test
    void wrong() {
        long x = Long.MAX_VALUE;
        double y = (double) Long.MAX_VALUE;
        //정확도 손실
        long z = Long.MAX_VALUE - 1;

        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("z : " + z);
        System.out.println((x == y) + " ");
        System.out.println((y == z) + " ");
        System.out.println((x == z));

        //교훈, float과 double로의 확정 기본 타입 변환시에는 정확도 손실을 주의하라.

    }

}
