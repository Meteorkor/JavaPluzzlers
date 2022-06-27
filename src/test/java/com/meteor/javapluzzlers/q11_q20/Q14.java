package com.meteor.javapluzzlers.q11_q20;

import org.junit.jupiter.api.Test;

public class Q14 {
    @Test
    void wrong() {
        //\u0022 -> "
        final int length = "a\u0022.length() + \u0022b".length();
        System.out.println(length);//26? 16? -> 2
        //미리, 유니코드 이스케이프를 유니코드 이스케이프가 나타내는 문자로 해석한다.
        System.out.println("a\u0022.length() + \u0022b");//1b
    }

    @Test
    void answer() {
        //\u0022 -> "
        final int length = "a\".length() + \"b".length();
        System.out.println(length);//16
        //미리, 유니코드 이스케이프를 유니코드 이스케이프가 나타내는 문자로 해석한다.
        //스트링이나 문자에, 유니코드 이스케이프보다 이스케이프 시퀀스를 사용하는것이 좋다.
    }
}
