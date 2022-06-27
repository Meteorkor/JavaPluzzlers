package com.meteor.javapluzzlers.q11_q20;

import org.junit.jupiter.api.Test;

public class Q17 {
    @Test
    void wrong() {
        String text = "\u0068\u0065\u006C\u006C\u006F \u0077\u006F\u0072\u006C\u0064";
        System.out.println("text : " + text);//hello world
        //동작은 하지만 어떤 값이 나오는지 예상하기 어렵다.
    }

    @Test
    void answer() {
        String text = "hello world";
        System.out.println("text : " + text);//hello world
        //동작은 하지만 어떤 값이 나오는지 예상하기 어렵다.
        //유니코드 이스케이프 문자는 다른 방법으로 표현할 수 없는 문자들을 삽입할 필요가 있을때는 필수적이나, 다른 모든 경우는 피하라.
    }

}
