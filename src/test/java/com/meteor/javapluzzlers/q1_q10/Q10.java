package com.meteor.javapluzzlers.q1_q10;

import org.junit.jupiter.api.Test;

public class Q10 {
    @Test
    void wrong() {

        //복합 할당 연산자는 두 연산 모두가 같은 타입이거나, 객체화된 기본 타입일것을 요구
        //하지만, 예외로, 좌측이 String 이면 우측에는 모든 타입이 올수 있다.

        Object x = "Buy ";
        String i = "Effective Java!";

        x = x + i;
//        System.out.println("x : " + x);
        x += i;//잘됨;;;
//        System.out.println("x : " + x);//
    }
}
