package com.meteor.javapluzzlers.q21_q30;

import org.junit.jupiter.api.Test;

public class Q29 {

    @Test
    void wrong() {
        {
            int i = 0;//infinite loop를 만드려면? i는? type은 아무거나
            while (i != i) {

            }
        }
    }

    @Test
    void answer() {
        {
//            double i = 0 / 0;//java.lang.ArithmeticException: / by zero
//            double i = 0.0 / 0.0;//NaN(Not a Number, 숫자가 아님)
            double i = Double.NaN;
            while (i != i) {
                System.out.println("infinite loop");
            }
        }
    }

}
