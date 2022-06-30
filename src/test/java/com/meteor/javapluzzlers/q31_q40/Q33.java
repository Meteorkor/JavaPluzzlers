package com.meteor.javapluzzlers.q31_q40;

import org.junit.jupiter.api.Test;

public class Q33 {

    @Test
    void wrong() {
        {
            int i = 0;//infinite loop를 만드려면? i는? type은 아무거나
            while (i != 0 && i == -i) {

            }
        }
    }

    @Test
    void answer() {
        {
            int i = Integer.MIN_VALUE;//-2147483648, '-'를 붙여서 2147483648로 바뀌면 overflow
            while (i != 0 && i == -i) {
                System.out.println("infinite loop");
            }
        }
    }

}
