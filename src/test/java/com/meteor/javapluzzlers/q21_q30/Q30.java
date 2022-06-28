package com.meteor.javapluzzlers.q21_q30;

import org.junit.jupiter.api.Test;

public class Q30 {

    @Test
    void wrong() {
        {
            int i = 0;//infinite loop를 만드려면? i는? 부동소수점 없이
            while (i != i + 0) {

            }
        }
    }

    @Test
    void answer() {
        {
            String i = "text";
            while (i != i + 0) {
                System.out.println("infinite loop");
            }
        }
    }

}
