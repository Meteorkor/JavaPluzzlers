package com.meteor.javapluzzlers.q41_q50;

import org.junit.jupiter.api.Test;

public class Q50 {

    @Test
    void type1() {
        String s = null;
        System.out.println(s instanceof String);// null
        //서브 타입이긴하지만, 피연산자가 null일경우 false를 반환한다.

    }

    @Test
    void type2() {
//        System.out.println(new Q50() instanceof String);
        //컴파일 에러

    }

    @Test
    void type3() {
        //lass java.lang.Object cannot be cast to class com.meteor.javapluzzlers.q41_q50.Q50
        Q50 q50 = (Q50) new Object();

    }

}
