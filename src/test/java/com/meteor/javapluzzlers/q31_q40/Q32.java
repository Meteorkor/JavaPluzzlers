package com.meteor.javapluzzlers.q31_q40;

import org.junit.jupiter.api.Test;

public class Q32 {

    @Test
    void wrong() {
        {
            int i = 0;//infinite loop를 만드려면? i는? type은 아무거나
            int j = 0;//infinite loop를 만드려면? j는? type은 아무거나
            while (i <= j && j <= i && i != j) {

            }
        }
    }

    @Test
    void answer() {
        {
//            Integer i = new Integer(0);
//            Integer j = new Integer(0);
            Integer i = new Integer(1000);//'<=', 는 unboxing 하여 비교, i != j 는 객체 동일 비교에서는 false
            Integer j = new Integer(1000);
            while (i <= j && j <= i && i != j) {
                System.out.println("infinite loop");
            }
        }
    }

}
