package com.meteor.javapluzzlers.q71_q80;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Q71 {

    @Test
    void wrong() {
        wrongPrintArgs(1, 2, 3, 4, 5);

    }

    static void wrongPrintArgs(Object... args) {
//        System.out.println(toString(args));//error
        //영역안에 멤버는 static 임포트 보다 우선순위가 높다.
        //static 임포트 기능은 꼭 필요한 경우에만 최소한으로 사용하라
    }

    @Test
    void answer() {
        answerPrintArgs(1, 2, 3, 4, 5);
    }

    private void answerPrintArgs(Object... args) {
        System.out.println(Arrays.toString(args));
    }

}
