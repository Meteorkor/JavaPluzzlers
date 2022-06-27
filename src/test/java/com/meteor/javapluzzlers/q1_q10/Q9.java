package com.meteor.javapluzzlers.q1_q10;

import org.junit.jupiter.api.Test;

public class Q9 {
    @Test
    void wrong() {
        short x = 0;
        int i = 1236456;

        x += i;//좌측 변수의 타입으로 자동 캐스팅
        //복합 할당 연산자는 암묵적으로 캐스트를 수행한다.
        //x = x + i;//err,
    }

    @Test
    void answer() {
        int x = 0;
        int i = 1236456;

        x += i;//좌측 변수의 타입으로 자동 캐스팅
        x = x + i;//ok
    }
}
