package com.meteor.javapluzzlers.q11_q20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q12 {
    @Test
    void wrong() {
        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };
        System.out.println(letters + "easy as " + numbers);

        //String.valueOf나 System.out.println 여러가지들에서 char[]를 문자열로 취급해주지만, 더하기 연산은 toString을 호출하여 해시코드가 출력됨
        Assertions.assertNotEquals("ABCeasy as 123", letters + "easy as " + numbers);
    }

    @Test
    void answer1() {
        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };

        Assertions.assertEquals("ABCeasy as 123", letters + "easy as " + String.valueOf(numbers));
    }

    @Test
    void answer2() {
        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };
        System.out.print(letters + "easy as ");
        System.out.println(numbers);
    }
}
