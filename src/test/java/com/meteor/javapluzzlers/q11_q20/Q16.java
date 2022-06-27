package com.meteor.javapluzzlers.q11_q20;

import org.junit.jupiter.api.Test;

public class Q16 {
    @Test
    void wrong() {
        //\ u000A는 라인피드(LF)의 유니코드 표현이다. // \와 u를 붙이면 컴파일 에러

        char c = 0x000A;
        System.out.println(c);
    }

    @Test
    void answer() {
        //유니코드 이스케이프보다는 이스케이프 시퀀스를 사용하라
        char c = '\n';
        System.out.println(c);
    }
}
