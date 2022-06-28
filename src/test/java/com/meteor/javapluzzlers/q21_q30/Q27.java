package com.meteor.javapluzzlers.q21_q30;

import org.junit.jupiter.api.Test;

public class Q27 {

    @Test
    void wrong() {
        int i = 0;
        while (-1 << i != 0) { //-1 << 32는 0이 아니라 -1
            System.out.println("i: " + i);
            i++;
        }
        System.out.println(i);
    }

    @Test
    void answer1() {
        //책에 답이긴한데 잘 이해가 가지 않음
        int distance = 0;
        for (int val = -1; val != 0; val <<= 1) {
            distance++;
        }
        System.out.println(distance);
    }

    @Test
    void answer2() {
        int i = 0;
        int value = -1;
        while (value != 0) {
            value = value << i;
            //-1, 0xffffffff
            System.out.println("value : " + value + ", i: " + i);
            i++;
        }
        System.out.println(i);
    }

}
