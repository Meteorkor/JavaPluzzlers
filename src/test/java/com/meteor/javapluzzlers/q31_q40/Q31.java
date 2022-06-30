package com.meteor.javapluzzlers.q31_q40;

import org.junit.jupiter.api.Test;

public class Q31 {

    @Test
    void wrong() {
        {
            int i = 0;//infinite loop를 만드려면? i는? 부동소수점 없이
            while (i != 0) {
                i >>>= 1;
            }
        }
    }

    @Test
    void answer() {
        {
            //어려움.., long,int는 안되고 short만 무한 loop
            short i = -1;//infinite loop를 만드려면? i는? 부동소수점 없이
            while (i != 0) {
                System.out.println("infinite loop");
                i >>>= 1;
            }
        }
    }

}
