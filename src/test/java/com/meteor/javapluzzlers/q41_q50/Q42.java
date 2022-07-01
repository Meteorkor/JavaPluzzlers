package com.meteor.javapluzzlers.q41_q50;

import org.junit.jupiter.api.Test;

public class Q42 {

    @Test
    void wrong() {
        int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };
        int successCount = 0;

        try {
            int i = 0;
            while (true) {
                if (wrongThirdElementIsThress(tests[i++])) {
                    successCount++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        System.out.println(successCount);//0
    }

    @Test
    void answer1() {
        int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };
        int successCount = 0;

        int i = 0;
        for (int[] ints : tests) {
            if (answerThirdElementIsThress(ints)) {
                successCount++;
            }
        }
        System.out.println(successCount);//0
    }

    private static boolean wrongThirdElementIsThress(int[] a) {
        return a.length >= 3 & a[2] == 3;
    }

    private static boolean answerThirdElementIsThress(int[] a) {
        return a.length >= 3 && a[2] == 3;
    }

}
