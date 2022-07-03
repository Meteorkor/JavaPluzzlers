package com.meteor.javapluzzlers.q51_q60;

import org.junit.jupiter.api.Test;

public class Q54 {

    @Test
    void wrong() {
        ((Null) null).greet();
        //Hello world!
        //static 메소드의 한정자로 사용된 표현식은 평가되지만 평가된 값은 무시된다.
        //NPE가 발생하지 않는다.
    }

    @Test
    void answer() {
        Null.greet();
    }

    class Null {
        public static void greet() {
            System.out.println("Hello world!");
        }
    }

}
