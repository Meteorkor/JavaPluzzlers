package com.meteor.javapluzzlers.q71_q80;

import org.junit.jupiter.api.Test;

public class Q72 {

    @Test
    void wrong() {
        System.out.println(DoubleJeopardy.PRIZE);//2 cents
        //메소드 final은 오버라이딩 할수 없고, 하이딩 할 수 없음
        //final 필드는 하이딩 가능하다.
        //이렇게 상속이나 하이딩이 필요하면 메소드로 선언하여 override 하라
    }

}

class Jeopardy {
    public static final String PRIZE = "&64,000";
}

class DoubleJeopardy extends Jeopardy {
    public static final String PRIZE = "2 cents";
}