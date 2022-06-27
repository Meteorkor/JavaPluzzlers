package com.meteor.javapluzzlers.q11_q20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q11 {
    @Test
    void wrong() {
        final String s = "H" + "a";
        final int i = 'H' + 'a';

        System.out.println("s : " + s);
        System.out.println("i : " + i);
        Assertions.assertNotEquals("Ha", i);
        Assertions.assertEquals(169, i);
        //char 16bit를 int 32bit로 확장
    }

    @Test
    void answer1() {
        StringBuilder stb = new StringBuilder();
        stb.append('H');
        stb.append('a');

        Assertions.assertEquals("Ha", stb.toString());
    }

    @Test
    void answer2() {
        //피연산자중 한개는 스트링이 되도록 하여 더하기 수행
        Assertions.assertEquals("Ha", "" + 'H' + 'a');
    }
}
