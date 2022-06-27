package com.meteor.javapluzzlers.q11_q20;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class Q20 {
    @Test
    void wrong() {
        System.out.println(Q20.class.getName().replaceAll(".", "/") + ".class");
        //expect: com/meteor/javapluzzlers/q11_q20/Q20.class
        //actual: ////////////////////////////////////.class
        //String.reaplceAll의 첫 arg는 정규식이다.
    }

    @Test
    void answer1() {
        System.out.println(Q20.class.getName().replaceAll("\\.", "/") + ".class");
        //expect: com/meteor/javapluzzlers/q11_q20/Q20.class
        //actual: com/meteor/javapluzzlers/q11_q20/Q20.class
        //String.reaplceAll의 첫 arg는 정규식이다.
    }

    @Test
    void answer2() {
        //JDK5에 Pattern.quote를 사용할 수 있다.
        System.out.println(Q20.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");
        //expect: com/meteor/javapluzzlers/q11_q20/Q20.class
        //actual: com/meteor/javapluzzlers/q11_q20/Q20.class
        //String.reaplceAll의 첫 arg는 정규식이다.
    }
}
