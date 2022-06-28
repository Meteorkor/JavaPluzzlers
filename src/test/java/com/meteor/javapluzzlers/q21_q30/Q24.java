package com.meteor.javapluzzlers.q21_q30;

import org.junit.jupiter.api.Test;

public class Q24 {

    @Test
    void wrong() {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x90) {//0x90-> +144
                System.out.println("Joy!");//not printing
            }
        }
    }

    @Test
    void answer() {
        //TODO, 추후 추가로 봐야할듯함
        //byte value = 0x90;, 0x90 int
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if ((b & 0xff) == 0x90) {
                System.out.println("Joy!");//not printing
            }
        }
    }

}
