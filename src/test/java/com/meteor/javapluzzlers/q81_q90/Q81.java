package com.meteor.javapluzzlers.q81_q90;

import org.junit.jupiter.api.Test;

public class Q81 {

    @Test
    void wrong() {
        String greeting = "Hello world";
        for (int i = 0; i < greeting.length(); i++) {
            System.out.write(greeting.charAt(i));//자동 플러싱이 활성화되어있는 경우에도 플러싱 하지 않는 유일한 메소드라고 한다(지금은 출력됨)
            //가능한 익숙한 이디엄을 사용하라. 만약 익숙한 API를 사용할 수 없다면, 반드시 자바 API 문서를 참조하라.
        }
    }

}
