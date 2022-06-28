package com.meteor.javapluzzlers.q21_q30;

import org.junit.jupiter.api.Test;

public class Q26 {
    final int END = Integer.MAX_VALUE;
    final int START = END - 100;

    @Test
    void wrong() {
        int count = 0;
        for (int i = START; i <= END; i++) {
//            System.out.println("i : " + i);//-2147335608
            count++;
        }
        System.out.println(count);
    }

    @Test
    void answer() {
        int count = 0;
        for (long i = START; i <= END; i++) {//'int'->'long', overflow prevent
//            System.out.println("i : " + i);//-2147335608
            count++;
        }
        System.out.println(count);
    }

}
