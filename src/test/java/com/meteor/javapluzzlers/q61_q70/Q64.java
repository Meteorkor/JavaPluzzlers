package com.meteor.javapluzzlers.q61_q70;

import org.junit.jupiter.api.Test;

public class Q64 {

    @Test
    void wrong() {
        final int MODULUS = 3;
        int[] histogram = new int[MODULUS];

        int i = Integer.MIN_VALUE;
        do {
            histogram[Math.abs(i) % MODULUS]++;
        } while (i++ != Integer.MAX_VALUE);

        for (int j = 0; j < MODULUS; j++) {
            System.out.println(histogram[j] + " ");
        }

    }

    @Test
    void answer() {
        System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
        System.out.println("Math.abs(Integer.MIN_VALUE) : " + Math.abs(Integer.MIN_VALUE));//-2147483648
        System.out.println("Math.abs(Integer.MIN_VALUE) % 3 : " + Math.abs(Integer.MIN_VALUE) % 3);

        //교훈, Math.abs()가 항상 양수를 반환하진 않는다.

        final int MODULUS = 3;
        int[] histogram = new int[MODULUS];

        int i = Integer.MIN_VALUE;
        do {
            histogram[Math.abs(i) % MODULUS]++;//Integer.MIN_VALUE의 Math.abs(i)는 Integer로 표현할 수 없음
        } while (i++ != Integer.MAX_VALUE);

        for (int j = 0; j < MODULUS; j++) {
            System.out.println(histogram[j] + " ");
        }

    }

}
