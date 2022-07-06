package com.meteor.javapluzzlers.q61_q70;

import org.junit.jupiter.api.Test;

import com.meteor.javapluzzlers.q61_q70.Q68.C;
import com.meteor.javapluzzlers.q61_q70.Q68.X;

public class Q69 {

    @Test
    void wrong() {
        System.out.println(((X.Y)null).Z);//Black
        //변수와 타입이 같은 이름을 갖고 있고, 이 둘이 같은 영역에 있을때에는 변수 이름의 우선순위가 높다
        //다행히 자바 네이밍 컨벤션에서는 클래스는 대문자, 변수는 소문자로 시작해서 이슈를 만날일은 거의 없다.

    }

    class X {
        static class Y {
            static String Z = "Black";
        }

        static Q68.C Y = new Q68.C();
    }

    static class C {
        String Z = "Whilte";
    }

}
