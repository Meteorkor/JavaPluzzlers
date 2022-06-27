package com.meteor.javapluzzlers.q1_q10;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

public class Q1 {
    final List<Integer> integers = List.of(1, 2, -1, -2, 0);
    final List<Boolean> expect = List.of(Boolean.TRUE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE,
                                         Boolean.FALSE);

    @Test
    void wrong() {
        for (int i = 0; i < integers.size(); i++) {
            Assertions.assertEquals(expect.get(i), WrongClass.isOdd(integers.get(i)));
        }
    }

    @Test
    void answer() {
        for (int i = 0; i < integers.size(); i++) {
            Assertions.assertEquals(expect.get(i), AnswerClass.isOdd_1(integers.get(i)));
            Assertions.assertEquals(expect.get(i), AnswerClass.isOdd_2(integers.get(i)));
        }
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    private class WrongClass {

        public static boolean isOdd(int i) {//-3 % 2 == -1
            return i % 2 == 1;
        }

    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    private class AnswerClass {

        public static boolean isOdd_1(int i) {
            return i % 2 != 0;
        }

        public static boolean isOdd_2(int i) {
            return (i & 1) != 0;
        }

    }
}
