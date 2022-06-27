package com.meteor.javapluzzlers.q11_q20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q13 {

    @Test
    void wrong() {
        final String pig = "length: 10";

        final String dog = "length: " + pig.length();

        Assertions.assertFalse(pig == dog);
    }

    @Test
    void answer1() {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();

        Assertions.assertTrue(pig == dog.intern());
        //좋지않은 답
    }

    @Test
    void answer2() {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        final String buds = "length: 10";//컴파일 타임에 상수들은 intern() 되어 같은 해시값을 갖는다.

        Assertions.assertTrue(pig.equals(dog));
        Assertions.assertTrue(pig == buds);
    }
}
