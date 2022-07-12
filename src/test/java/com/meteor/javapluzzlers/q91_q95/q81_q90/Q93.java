package com.meteor.javapluzzlers.q91_q95.q81_q90;

import org.junit.jupiter.api.Test;

public class Q93 {

    @Test
    void wrong() {

        System.out.println(Words1.FIRST + " " + Words1.SECOND + " " + Words1.THIRD);
        //Words1와 Words2 가 클래스명이 같다고 했을때
        //Words1은 다시 컴파일 하고, Test(Client)코드는 컴파일을 다시 하지 않았을때 어떤것이 출력되는가?

        //the null set 이 출력될것을 기대하지만
        //the chemistry set 이 출력된다고 한다.

        //null은 컴파일 타임 상수 표현식이 아니기 때문에
    }
}

class Words1 {
    private Words1() {}

    public static final String FIRST = "the";
    public static final String SECOND = null;
    public static final String THIRD = "set";
}

class Words2 {
    private Words2() {}

    public static final String FIRST = "physics";
    public static final String SECOND = "chemistry";
    public static final String THIRD = "biology";
}
