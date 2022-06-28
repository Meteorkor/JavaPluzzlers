package com.meteor.javapluzzlers.q21_q30;

import org.junit.jupiter.api.Test;

public class Q28 {

    @Test
    void wrong() {
        {
            int start = Integer.MAX_VALUE - 1;
            for (int i = start; i <= start + 1; i++) {
                //infinite loop
            }
        }
        {
            int i = 0;//infinite loop를 만드려면? i는? type은 아무거나
            while (i == i + 1) {

            }
        }
    }

    @Test
    void answer() {
        {
//            double i = 1.0/0.0;
            double i = Double.POSITIVE_INFINITY;
            while (i == i + 1) {
                System.out.println("infinite loop");
            }
        }
    }

}
