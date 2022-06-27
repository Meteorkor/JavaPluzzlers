package com.meteor.javapluzzlers.q1_q10;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q4 {

    @Test
    void wrong1() {
        long val = 12345 + 5432l;//Long에서 소문자 l은 사용하지 말라, L을 사용하라, 구분이 안될수 있음
        Assertions.assertEquals(66666, val);
    }

    @Test
    void wrong2() {
        final List<String> l = List.of("");

        System.out.println(l);//1인지 L인지 잘 구분이 안되니 l은 사용하지 않는것이 좋다.
    }

}
