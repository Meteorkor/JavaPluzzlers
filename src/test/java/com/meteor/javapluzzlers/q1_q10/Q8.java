package com.meteor.javapluzzlers.q1_q10;

import org.junit.jupiter.api.Test;

public class Q8 {
    @Test
    void wrong() {
        char x = 'X';
        int i = 0;
        System.out.println(true ? x : 0);//X
        System.out.println(false ? i : x);//88
        final char c = true ? x : 0;
        final int i1 = false ? i : x;
        //혼합된 타입연산은 혼란을 일으킬 수 있다.
    }
}
