package com.meteor.javapluzzlers.q21_q30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q25 {

    @Test
    void wrong() {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j = j++;// j++, getAndIncrement
        }
        System.out.println(j);//0
    }

    @Test
    void answer1() {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j++;
        }
        System.out.println(j);//100
        Assertions.assertEquals(100, j);
    }

    @Test
    void answer2() {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j += 1;
        }
        System.out.println(j);//100
        Assertions.assertEquals(100, j);
    }

}
